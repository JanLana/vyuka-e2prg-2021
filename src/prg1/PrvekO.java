package prg1;

public class PrvekO {
    int i;
    PrvekO dalsi;
    PrvekO predchozi;

    public PrvekO(int i, PrvekO dalsi, PrvekO predchozi) {
        this.i = i;
        this.dalsi = dalsi;
        this.predchozi = predchozi;
    }
}
