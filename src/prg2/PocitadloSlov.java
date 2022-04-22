package prg2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PocitadloSlov {
    public static void main(String[] args) throws IOException {
        File f = new File("z:/complet.txt");
        Scanner sc = new Scanner(f);

        while(sc.hasNext()) {
            String line = sc.nextLine();
            String[] slova = line.split("[ .,!-:?“„]");

            for(String s: slova) {
                System.out.println(s);
            }
        }

    }
}
