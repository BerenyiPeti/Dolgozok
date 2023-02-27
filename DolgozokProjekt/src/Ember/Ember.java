package Ember;

public class Ember {

    private String nev;
    private int kor;
    private String neme;
    private int munkToltEv;

    public Ember(String nev, int kor, String neme, int munkToltEv) {
        this.nev = nev;
        this.kor = kor;
        this.neme = neme;
        this.munkToltEv = munkToltEv;
    }

    public Ember(String sor, String sep) {
        String[] darabolt = sor.split(sep);
        nev = darabolt[0];
        kor = Integer.parseInt(darabolt[1]);
        neme = (darabolt[2]);
        munkToltEv = 0;
    }

    public String getNev() {
        return nev;
    }

    public String getNeme() {
        return neme;
    }

    public int getKor() {
        return kor;
    }

    public int getMunkToltEv() {
        return munkToltEv;
    }
    
    
    
    
    
    
    
    
    
    

}
