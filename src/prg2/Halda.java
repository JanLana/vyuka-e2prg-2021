package prg2;


import java.util.ArrayList;

public class Halda {
    ArrayList<Integer> halda;

    public Halda() {
        halda = new ArrayList<>();
    }

    public int nejmensi() {
        return halda.get(0);
    }

    public void pridej(int novyPrvek) {
        halda.add(novyPrvek);
        spravIndex(halda.size()-1);
    }

    public void spravIndex(int i) {
        if (i == 0)
            return;

        int indexOtce = (i-1)/2;

        if (halda.get(indexOtce) < halda.get(i)) {
            return;
        } else {
            int k = halda.get(indexOtce);
            halda.set(indexOtce, halda.get(i));
            halda.set(i, k);
            spravIndex(indexOtce);
        }

    }

    public static void main(String[] args) {
        Halda h = new Halda();
        for (int i = 10; i > 0; i--) {
            h.pridej(i);
        }
        System.out.println(h.nejmensi());
        System.out.println(h.halda);
    }
}
