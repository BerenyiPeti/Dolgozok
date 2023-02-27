package modell;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class Modell {

    public static void main(String[] args) throws IOException {
        new Modell().beolvas();
    }

    public void beolvas() throws IOException {
        String fajlNev = "emberek.txt";
        Path path = Paths.get(fajlNev);
        List<String> sorok = Files.readAllLines(path);
        int fejlec = 0;
        sorok.remove(fejlec);
        /*
        for (String sor : sorok) {
            System.out.println(sor);
        }
         */
        HashMap<String, Integer> emberek = new HashMap<String, Integer>();
        
    }
}
