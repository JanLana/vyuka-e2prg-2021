package prg1;

import java.util.ArrayList;

public class Halda {
    ArrayList<Integer> halda;

    public Halda() {
        this.halda = new ArrayList<>();
    }

    public int dejNejmensi() {
        return halda.get(0);
    }

    public void pridejPrvek(int x) {
        halda.add(x);
        int indexMuj = halda.size() - 1;

        if (indexMuj == 0) {
            return;
        }

        int indexOtce = (indexMuj -1) / 2;
        if (halda.get(indexMuj) < halda.get(indexOtce)) {
            int y;
            y = halda.get(indexMuj);
            halda.set(indexMuj, halda.get(indexOtce));
            halda.set(indexOtce, y);
        } else {
            return;
        }

    }
}
