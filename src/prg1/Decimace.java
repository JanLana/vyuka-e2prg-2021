package prg1;

public class Decimace {

    public static void vypis(Prvek hlava) {
        Prvek x = hlava.dalsi;
        System.out.print(hlava.hodnota + " ");
        while(x.hodnota != hlava.hodnota) {
            System.out.print(x.hodnota + " ");
            x = x.dalsi;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Prvek hlava = null;

        for (int i = 10; i > 0; i--) {
            Prvek novy = new Prvek(i, hlava);
            hlava = novy;
        }

        Prvek posledni = hlava;
        while(posledni.dalsi != null) {
            posledni = posledni.dalsi;
        }
        posledni.dalsi = hlava;

        for (int j = 0; j < 10; j++) {
            vypis(hlava);

            for (int i = 0; i < 8; i++) {
                hlava = hlava.dalsi;
            }
            System.out.println(hlava.dalsi);
            hlava.dalsi = hlava.dalsi.dalsi;

            hlava = hlava.dalsi;
        }
    }


    }

