package Lektion16.Cyborg;

public interface Mensch {
    /*
    public void essen();
    public void schlafen();
    public void arbeiten();
    public void autofahren();

    --> in der Prüfung, müssen alle Methoden die im Text erwähnt werden im Interface stehen. Es kann jedoch sein, dass die Aufgabenstellung
        vorgibt, dass man nicht alle davon implementieren muss. Im Zweifelsfall einfach void-Methode ohne Inhalt schreiben, damit die Klasse
        insgesamt compile-ready ist
     */
    public Entscheidung entscheide(Gefahrensituation g);

}
