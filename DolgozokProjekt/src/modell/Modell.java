package modell;

import Ember.Ember;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import view.Dolgozok;

public class Modell {

    private String nev;
    private int kor;
    private String neme;
    private int munkToltEv;

    private Map<String, Integer> lanyokKorai = new HashMap<>();
    private Map<String, Integer> fiukKorai = new HashMap<>();
    private List<String> lanyok = new ArrayList<>();
    private List<String> fiuk = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        new Modell().beolvas();
        
        new Dolgozok().setVisible(true);
        
    }

    public void beolvas() throws IOException {
        List<Ember> emberek = new ArrayList<>();
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
        for (String sor : sorok) {
            Ember ember = new Ember(sor, ";");

            if (ember.getNeme().equals("L")) {
                lanyok.add(ember.getNev());
                lanyokKorai.put(ember.getNev(), ember.getKor());
            }

            if (ember.getNeme().equals("F")) {
                fiuk.add(ember.getNev());
                fiukKorai.put(ember.getNev(), ember.getKor());
            }
        }

    }

    public List<String> getLanyok() {
        return lanyok;
    }

    public List<String> getFiuk() {
        return fiuk;
    }

    public int getLegidosebbLanyKor() {
        int legtobb = 0;
        for (String i : lanyokKorai.keySet()) {
            if (lanyokKorai.get(i) > legtobb) {
                legtobb = lanyokKorai.get(i);
            }
        }
        return legtobb;
    }

}
