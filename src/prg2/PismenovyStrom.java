package prg2;

import prg1.PismenkovyStrom;

import java.util.ArrayList;

public class PismenovyStrom {
    char znak;
    int pocet;
    ArrayList<PismenkovyStrom> potomci;

    public PismenovyStrom(char znak) {
        this.znak = znak;
        pocet = 0;
        potomci = new ArrayList<>();
    }
    public void pridej(String slovo) {
        char ch = slovo.charAt(0);
        // najdi potomka 'p' pro pismenko ch
        // pokud neni, tak vyrob novy uzel p
        // p.pridej(slovo bez prvniho pismene)
    }

    public static void main(String[] args) {
        PismenovyStrom p = new PismenovyStrom(' ');
        p.pridej("ahoj");
    }
}
