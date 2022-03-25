package prg1;

public class SpojSeznam5 {
    public static void vypisPopredu(PrvekO p) {
        while (p != null) {
            System.out.println(p.i);
            p = p.dalsi;
        }
    }

    public static void vypisPozpatku(PrvekO p) {
        while (p != null) {
            System.out.println(p.i);
            p = p.predchozi;
        }
    }


    public static void main(String[] args) {
        PrvekO prvni = null;

        // vytvoreni seznamu
        for (int i = 0; i < 5; i++) {
            PrvekO novy = new PrvekO(i, prvni, null);
            if (prvni != null) {
                prvni.predchozi = novy;
            }
            prvni = novy;
        }

        //odtraneni tretiho prvku
        PrvekO druhy = prvni.dalsi;
        druhy.dalsi = druhy.dalsi.dalsi;
        druhy.dalsi.predchozi = druhy;


        // vypsani seznamu
        vypisPopredu(prvni);

        System.out.println("------");

        PrvekO posledni = prvni;
        while(posledni.dalsi != null) {
            posledni = posledni.dalsi;
        }
        vypisPozpatku(posledni);
    }
}
