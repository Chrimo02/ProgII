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

}
