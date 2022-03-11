package prg1;

public class Prvek {
    int hodnota;
    Prvek dalsi;

    public Prvek(int hodnota, Prvek dalsi) {
        this.hodnota = hodnota;
        this.dalsi = dalsi;
        //this.jePosledni = false;
    }

    @Override
    public String toString() {
        return  "" + hodnota;
    }
}
