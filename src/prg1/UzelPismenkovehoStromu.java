package prg1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class UzelPismenkovehoStromu {
    char znak;
    ArrayList<UzelPismenkovehoStromu> potomci;
    int pocetSlov;

    public UzelPismenkovehoStromu(char znak) {
        this.znak = znak;
        potomci = new ArrayList<>();
        pocetSlov = 0;
    }

    @Override
    public String toString() {
        return "UzelPismenkovehoStromu{" +
                "znak=" + znak +
                ", potomci=" + potomci +
                '}';
    }

    public UzelPismenkovehoStromu hledejPotomka(char ch) {
           for (UzelPismenkovehoStromu u : potomci) {
               if (u.znak == ch) {
                   return u;
               }
           }

           // nenasel jsem ho
        UzelPismenkovehoStromu potomek = new UzelPismenkovehoStromu(ch);
        potomci.add(potomek);
       return potomek;
    }

    public void pridej(String slovo) {
        if (slovo.length() == 0 ) {
            pocetSlov += 1;
            return;
        }
        char ch = slovo.charAt(0);

        UzelPismenkovehoStromu p = hledejPotomka(ch);
        p.pridej(slovo.substring(1));
    }




    public static void main(String[] args) throws IOException {
        UzelPismenkovehoStromu strom = new UzelPismenkovehoStromu(' ');

        File f = new File("z:/complet.txt");
        Scanner sc = new Scanner(f);

        while(sc.hasNext()) {
            String line = sc.nextLine();
            String[] slova = line.split("[\\[\\] .,;„“!-:?‘–‚»<]");
            for (String s : slova) {
                strom.pridej(s.toLowerCase());
            }

        }

        for (UzelPismenkovehoStromu u: strom.potomci) {
            System.out.print(u.znak);
        }
    }
}

//UzelPismenkovehoStromu{znak= ,
//   potomci=[
//      UzelPismenkovehoStromu{znak=a,
//         potomci=[
//             UzelPismenkovehoStromu{znak=h,
//                 potomci=[UzelPismenkovehoStromu{znak=o,
//                    potomci=[UzelPismenkovehoStromu{znak=j,
//                        potomci=[]}]}]}]}]}


