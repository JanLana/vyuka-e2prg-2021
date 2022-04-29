package prg2;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class UzelPS {
    char znak;
    UzelPS[] potomci;
    int pocetSlov;


    public UzelPS(char znak) {
        this.znak = znak;
        potomci = new UzelPS[155];
        pocetSlov = 0;
    }

    @Override
    public String toString() {
        return "UzelPS{" +
                "znak=" + znak +
                ", potomci=" + Arrays.toString(potomci) +
                '}';
    }

    public int nejvetsiPocetSlov() {
        int maximum = pocetSlov;

        for (int i = 0; i < potomci.length; i++) {
            if (potomci[i] != null) {
                int maximumPotomek = potomci[i].nejvetsiPocetSlov();

                if (maximum < maximumPotomek) {
                    maximum = maximumPotomek;
                }
            }
        }

        return maximum;

    }

    public void pridejSlovo(String vstup) {
        if (vstup.length() == 0) {
            pocetSlov += 1;
            return;
        }
        //System.out.println("pridejSlovo('" + vstup + "')");
        char ch = vstup.charAt(0);

        UzelPS p = null;

        for (int i = 0; i < potomci.length; i++) {
            if (potomci[i] == null) {
                p = potomci[i] = new UzelPS(ch);
                break;
            } else if (ch == potomci[i].znak) {
                p = potomci[i];
                break;
            }
        }

        p.pridejSlovo(vstup.substring(1));
    }

    public static void main(String[] args) throws IOException {
        UzelPS koren = new UzelPS(' ');

        File f = new File("z:/complet.txt");
        Scanner sc = new Scanner(f);

        while(sc.hasNext()) {
            String line = sc.nextLine();
            String[] slova = line.split("[ .,!-:?“„»;‚‘–<]");

            for(String s: slova) {
                koren.pridejSlovo(s.toLowerCase());
            }
        }

        System.out.println(koren.nejvetsiPocetSlov());

        /*
        for (int i = 0; i < koren.potomci.length; i++) {
            if (koren.potomci[i] != null)
                System.out.print(koren.potomci[i].znak);
        }

         */
    }
}//
// UzelPS{znak= , pocet=0,
//   potomci=[
//      UzelPS{znak=a, pocet=0,
//         potomci=[UzelPS{znak=h, pocet=0,
//            potomci=[UzelPS{znak=o, pocet=0,
//                potomci=[UzelPS{znak=j, pocet=0,
//                    potomci=[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]}, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
//                    }
//                    , null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]}, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]}, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]}


