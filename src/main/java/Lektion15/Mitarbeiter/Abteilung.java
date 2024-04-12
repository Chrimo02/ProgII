package Lektion15.Mitarbeiter;

import java.util.ArrayList;
import java.util.List;

public class Abteilung {
    String abteilungsname;
    Abteilungsleiter abteilungsleiter;
    List<Angestellter> angestellte;
    public Abteilung(String abteilungsname, Abteilungsleiter abteilungsleiter){
        this.abteilungsname = abteilungsname;
        this.abteilungsleiter =  abteilungsleiter;
        angestellte = new ArrayList<>();
    }
    public void addAngestellter(Angestellter a){
        this.angestellte.add(a);
    }
    public void setAbteilungsleiter(Abteilungsleiter abteilungsleiter){
        this.abteilungsleiter = abteilungsleiter;
    }
    public List<Angestellter> getAngestellte(){
        return angestellte;
    }
    /*public static void main(String[] args){
        Angestellter a1 = new Angestellter("Meier", "Peter",5000,"01.01.2000" );
        Angestellter a2 = new Angestellter("Meier", "Peter",5000,"01.01.2000" );
        Angestellter a3 = new Angestellter("Meier", "Peter",5000,"01.01.2000" );
        Angestellter a4 = new Angestellter("Meier", "Peter",5000,"01.01.2000" );
        Abteilungsleiter al1 = new Abteilungsleiter("Günter","Netzer",1000000,"05.05.1955");
        Abteilung buchhaltung = new Abteilung("Buchhaltung",al1);
        buchhaltung.addAngestellter(a1);
        buchhaltung.addAngestellter(a2);
        buchhaltung.addAngestellter(a3);
        buchhaltung.addAngestellter(a4);
    }*/
}
