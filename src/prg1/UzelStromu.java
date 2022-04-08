package prg1;

public class UzelStromu {
    int hodnota;

    UzelStromu levy;
    UzelStromu pravy;


    public UzelStromu(int hodnota, UzelStromu levy, UzelStromu pravy) {
        this.hodnota = hodnota;
        this.levy = levy;
        this.pravy = pravy;
    }

    public UzelStromu(int hodnota) {
        this.hodnota = hodnota;
        this.levy = this.pravy = null;
    }

    @Override
    public String toString() {
        return "UzelStromu{" +
                "hodnota=" + hodnota +
                "\n levy=" + levy +
                "\n pravy=" + pravy +
                '}';
    }

    public boolean obsahuje(int x) {
        if (hodnota == x) {
            return true;
        }
        if (levy != null) {
            if (levy.obsahuje(x)) {
                return true;
            }
        }
        if (pravy != null && pravy.obsahuje(x)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        UzelStromu koren = new UzelStromu(
                20,
                new UzelStromu(5,
                        new UzelStromu(1), new UzelStromu(13)),
                new UzelStromu(50,
                        new UzelStromu(27), new UzelStromu(100)));


        if (koren.obsahuje(14)) {
            System.out.println("hura");
        } else {
            System.out.println("smula");
        }
    }
}
