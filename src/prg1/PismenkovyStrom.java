package prg1;

import java.util.ArrayList;

public class PismenkovyStrom {
    char znak;
    int pocet;
    ArrayList<PismenkovyStrom> potomci;

    public PismenkovyStrom(char znak, int pocet) {
        this.znak = znak;
        this.pocet = pocet;
        potomci = new ArrayList<>();
    }

    public int pridejSlovo(String slovo) {
        // jestli je slovo prazdne, tak nic

        char ch = slovo.charAt(0);
        // jestli ch neni mezi potomky, vyrob noveho promka pro ch

        // pro potomka  potomek.pridejSlovo(slovo bez prvniho pismenka)

        return 0;

    }
}
