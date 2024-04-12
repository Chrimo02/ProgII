package Lektion15.Mitarbeiter;

public class Abteilungsleiter extends Angestellter{

    public Abteilungsleiter(String vorname, String nachname, double grundgehalt, String geburtsdatum){
        super(vorname,nachname,grundgehalt,geburtsdatum);
        this.gehaltsfaktor = 2;
    }

    public void befoerdern(Angestellter a){
        a.gehaltsfaktor = a.gehaltsfaktor * 1.1;
    }


}
