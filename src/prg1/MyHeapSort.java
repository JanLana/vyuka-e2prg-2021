package prg1;

import java.util.ArrayList;

public class MyHeapSort {
    int[] halda;

    public MyHeapSort(int[] vstup) {
        this.halda = vstup;
        this.setridSe();
    }

    public void setridSe() {

    }

    /*public int dejNejmensi() {
        return halda.get(0);
    }*/

    public void pridejPrvek(int x) {
        halda.add(x);
        int indexMuj = halda.size() - 1;

        if (indexMuj == 0) {
            return;
        }

        int indexOtce = (indexMuj -1) / 2;
        if (halda.get(indexMuj) > halda.get(indexOtce)) {
            int y;
            y = halda.get(indexMuj);
            halda.set(indexMuj, halda.get(indexOtce));
            halda.set(indexOtce, y);
        } else {
            return;
        }

    }

    public static void main(String[] args) {

        MyHeapSort h = new MyHeapSort(new int[] {1, 13, 20, 5, 4});

        for (Integer x: h.halda) {
            System.out.println(x);
        }
    }
}
