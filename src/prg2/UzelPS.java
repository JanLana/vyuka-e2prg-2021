package prg2;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class UzelPS {
    char znak;
    int pocet;

    UzelPS[] potomci;

    public UzelPS(char znak) {
        this.znak = znak;
        pocet = 0;
        potomci = new UzelPS[155];
    }

    @Override
    public String toString() {
        return "UzelPS{" +
                "znak=" + znak +
                ", pocet=" + pocet +
                ", potomci=" + Arrays.toString(potomci) +
                '}';
    }

    public void pridejSlovo(String vstup) {
        if (vstup.length() == 0) {
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

         /*
            //if (uzel != null && ch == uzel.znak) {
            if (potomci[i] == null && ch == potomci[i].znak) {
                p = potomci[i];
            }

            if (potomci[i] == null) {
                potomci[i] = new UzelPS(ch);
                // FIXME: pridej p do potomci
            } */




    }

    public static void main(String[] args) throws IOException {
        UzelPS koren = new UzelPS(' ');

        File f = new File("z:/complet.txt");
        Scanner sc = new Scanner(f);

        while(sc.hasNext()) {
            String line = sc.nextLine();
            String[] slova = line.split("[ .,!-:?“„]");

            for(String s: slova) {
                koren.pridejSlovo(s);
            }
        }

        System.out.println(koren);
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


