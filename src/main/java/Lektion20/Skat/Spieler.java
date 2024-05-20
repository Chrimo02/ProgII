package Lektion20.Skat;

public class Spieler {
    String name;
    SkatHand kartenhand;
    public Spieler(String name, Kartenset kartenset){
        this.name = name;
        this.kartenhand = new SkatHand(kartenset);
    }
}
