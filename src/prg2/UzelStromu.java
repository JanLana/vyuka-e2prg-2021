package prg2;

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
        levy = pravy = null;
    }

    public boolean jeTamHodnota(int x) {
        if (hodnota == x) {
            return true;
        }

        if (levy != null) {
            if (levy.jeTamHodnota(x)) {
                return true;
            }
        }
        if (pravy != null && pravy.jeTamHodnota(x)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "UzelStromu{" +
                "hodnota=" + hodnota +
                ", levy=" + levy +
                ", pravy=" + pravy +
                '}';
    }

    public static void main(String[] args) {
        UzelStromu c = new UzelStromu(20,
                new UzelStromu(13, new UzelStromu(18), new UzelStromu(1)),
                new UzelStromu(100, new UzelStromu(50), new UzelStromu(1000)));

        if (c.jeTamHodnota(17)) {
            System.out.println("hura");
        } else {
            System.out.println("smula");
        }
    }
}
