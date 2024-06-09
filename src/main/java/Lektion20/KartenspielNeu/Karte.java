package Lektion20.KartenspielNeu;

public class Karte implements Comparable<Karte> {

    Spielfarbe farbe;
    Wertigkeit wert;
    public Karte(Spielfarbe farbe, Wertigkeit wert){
        this.farbe = farbe;
        this.wert = wert;
    }

    public void printKarte(){
        System.out.println(this.farbe + " " + this.wert);
    }
    @Override
    public int compareTo(Karte s){
        if (this.wert.rang < s.wert.rang) return 1;
        else if (this.wert.rang > s.wert.rang) return -1;
        else {
            if (this.farbe.rang < s.farbe.rang) return 1;
            else if (this.farbe.rang > s.farbe.rang) return -1;
        }
        return 0;
    }




}
