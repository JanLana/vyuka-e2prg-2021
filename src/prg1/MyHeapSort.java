package prg1;

import java.util.ArrayList;

public class MyHeapSort {
    int[] halda;
    int velikostHaldy;

    public MyHeapSort(int[] vstup) {
        this.halda = vstup;
        velikostHaldy = 1;

        this.setridSe();
    }

    public void setridSe() {
        while (velikostHaldy < halda.length) {
            pridejPrvek();
        }
        System.out.println(halda);

    }

    /*public int dejNejmensi() {
        return halda.get(0);
    }*/

    public void pridejPrvek() {
        velikostHaldy += 1;
        int indexMuj = velikostHaldy - 1;

        while (indexMuj == 0) {

            int indexOtce = (indexMuj - 1) / 2;
            if (halda[indexMuj] > halda[indexOtce]) {
                prohod(indexMuj, indexOtce);
            } else {
                return;
            }
            indexMuj = indexOtce;
        }
    }

    void prohod(int indexA, int indexB) {
        int y;
        y = halda[indexA];
        halda[indexA] =  halda[indexB];
        halda[indexB] = y;
    }

    void odeberPrvek() {
        int indexMuj = velikostHaldy -1;
        velikostHaldy--;

        prohod(0, indexMuj);
        int indexSynaA = 2*indexMuj + 1;
        int indexSynaB = 2*indexMuj + 2;

        while(indexMuj < velikostHaldy) {

        }


    }

    public static void main(String[] args) {

        MyHeapSort h = new MyHeapSort(new int[] {1, 13, 20, 5, 4});

        for (Integer x: h.halda) {
            System.out.println(x);
        }
    }
}
