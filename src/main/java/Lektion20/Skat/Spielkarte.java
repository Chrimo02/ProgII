package Lektion20.Skat;


public class Spielkarte implements Comparable<Spielkarte> {

    Spielfarbe farbe;
    Wertigkeit wert;
    public Spielkarte(Spielfarbe farbe, Wertigkeit wert){
        this.farbe = farbe;
        this.wert = wert;
    }

    public void printKarte(){
        System.out.println(this.farbe + " " + this.wert);
    }
    @Override
    public int compareTo(Spielkarte s){
        if (this.wert.rang < s.wert.rang) return 1;
        else if (this.wert.rang > s.wert.rang) return -1;
        else {
            if (this.farbe.rang < s.farbe.rang) return 1;
            else if (this.farbe.rang > s.farbe.rang) return -1;
        }
        return 0;
    }




}
