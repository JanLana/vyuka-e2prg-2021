package prg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CteniSlov {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("z:/complet.txt");
        Scanner sc = new Scanner(f);

        while(sc.hasNext()) {
            String line = sc.nextLine();
            String[] slova = line.split("[ .,;„“!-:?‘]");
            for (String s : slova) {
                System.out.println(s);
            }

        }

    }
}
