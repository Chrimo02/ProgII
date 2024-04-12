package Lektion15.Mitarbeiter;

import java.util.Date;

public class Angestellter {

    public static int lfdMitarbeiterID = 0;
    String vorname;
    String nachname;
    int mNum;
    double grundgehalt;
    double gehaltsfaktor;
    String geburtsdatum; //könnte auch mit separater Datum-Klasse gemacht werden
    double gehalt;
    public Angestellter(String vorname, String nachname, double grundgehalt, String geburtsdatum){
        lfdMitarbeiterID++;
        this.vorname = vorname;
        this.nachname = nachname;
        this.mNum = lfdMitarbeiterID;
        this.grundgehalt = grundgehalt;
        this.gehaltsfaktor = 1;
        this.geburtsdatum = geburtsdatum;
        this.gehalt = grundgehalt * this.gehaltsfaktor;
    }


    
    
}
