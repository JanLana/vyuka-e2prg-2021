package prg2;

public class Seznam5 {

    public static void main(String[] args) {
        SPrvek prvni = new SPrvek(5, null, null);

        for (int i = 4; i > 0; i--) {
            SPrvek novy = new SPrvek(i, prvni, null);
            prvni.predchozi = novy;

            prvni = novy;

            Graph.print();
        }


        SPrvek druhy = prvni.dalsi;
        SPrvek treti = druhy.dalsi;
        SPrvek ctvrty = treti.dalsi;

        druhy.dalsi = ctvrty;
        ctvrty.predchozi = druhy;

        //prvni.dalsi.dalsi = prvni.dalsi.dalsi.dalsi;


        //prvni.vypisPopredu();
        //System.out.println();

        SPrvek posledni = prvni;
        while(posledni.dalsi != null) {
            posledni = posledni.dalsi;
        }

        //posledni.vypisPozpatku();

        Graph.print();
    }
}
