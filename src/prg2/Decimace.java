package prg2;

public class Decimace {

    public static void vypis(SPrvek hlava) {
        SPrvek p = hlava;
        for(;;) {
            System.out.print(p.hodnota + " ");
            p = p.dalsi;

            if (p == hlava)
                break;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        SPrvek posledni = new SPrvek(10, null);
        SPrvek hlava = posledni;

        for (int i = 9; i > 0; i--) {
            SPrvek p = new SPrvek(i, hlava);
            hlava = p;
        }
        posledni.dalsi = hlava;

        // decimace
        for (int j = 0; j < 10; j++) {
            vypis(hlava);

            // vyhod desateho
            for (int i = 0; i < 9; i++) {
                hlava = hlava.dalsi;
            }

            SPrvek prechozi = hlava;
            for (int i = 0; i < 9-j; i++) {
                prechozi = prechozi.dalsi;
            }
            prechozi.dalsi = hlava.dalsi;
            hlava = hlava.dalsi;
        }

        /*
        for (int i = 0; i < 10; i++) {
            System.out.print(hlava.hodnota + " ");
            hlava = hlava.dalsi;
        }
        System.out.println();
        */

        /*

        SPrvek hlava = null;
        for (int i = 10; i > 0; i--) {
            SPrvek p = new SPrvek(i, hlava);
            hlava = p;
        }

        SPrvek posledni = hlava
        while(posledni.dalsi != null) {
            posledni = posledni.dalsi;
        }

         */


    }
}
