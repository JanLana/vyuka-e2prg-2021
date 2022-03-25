package prg2;

public class SPrvek {
    int hodnota;
    SPrvek dalsi;
    SPrvek predchozi;

    public SPrvek(int hodnota, SPrvek dalsi, SPrvek predchozi) {
        this.hodnota = hodnota;
        this.dalsi = dalsi;
        this.predchozi = predchozi;

        Graph.addNode(this, "dalsi", "predchozi");
    }

    public void vypisPopredu() {
        for(SPrvek p = this; p != null; p = p.dalsi) {
            System.out.print(" " + p.hodnota);
        }
    }

    public void vypisPozpatku() {
        for(SPrvek p = this; p != null; p = p.predchozi) {
            System.out.print(" " + p.hodnota);
        }
    }


    @Override
    public String toString() {
        return  "" + hodnota;
    }
}

