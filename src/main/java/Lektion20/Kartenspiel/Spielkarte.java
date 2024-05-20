package Lektion20.Kartenspiel;

public class Spielkarte {

    Spielfarbe farbe;
    Wertigkeit wert;
    public Spielkarte(Spielfarbe farbe, Wertigkeit wert){
        this.farbe = farbe;
        this.wert = wert;
    }

    public void printKarte(){
        System.out.println(this.farbe + " " + this.wert);
    }





}
