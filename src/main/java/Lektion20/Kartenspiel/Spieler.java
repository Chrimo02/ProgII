package Lektion20.Kartenspiel;

public class Spieler {
    String name;
    MauMauHand kartenhand;
    public Spieler(String name, Kartenset kartenset){
        this.name = name;
        this.kartenhand = new MauMauHand(kartenset);
    }
}
