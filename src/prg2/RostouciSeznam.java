package prg2;

import java.util.Scanner;

public class RostouciSeznam {
    public static void main(String[] args) {
        SPrvek prvni = null;
        SPrvek posledni = null;

        Scanner sc = new Scanner(System.in);

        for(;;) {
            int v = sc.nextInt();
            if (v == 0)
                break;

            SPrvek novy = new SPrvek(v, null, posledni);
            if (posledni == null) {
                posledni = novy;
                prvni = novy;
            } else {
                posledni.dalsi = novy;
                posledni = novy;
            }
        }

        for(SPrvek p = prvni; p != null; p = p.dalsi) {
            if (p.hodnota <= p.predchozi.hodnota) {

            }
        }

        prvni.vypisPopredu();

    }
}
