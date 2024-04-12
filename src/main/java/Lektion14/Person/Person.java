package Lektion14.Person;

public class Person {
    String vorname;
    String nachname;
    Adresse adresse;

    public Person(String vorname, String nachname, String strasse, String hausnummer, int postleitzahl, String ort){
        char x = vorname.charAt(0);
        char y = strasse.charAt(0);
        char z = ort.charAt(0);
        char h = hausnummer.charAt(0);

        if ((x < 'A' || x > 'Z') || (y < 'A' || y > 'Z') || (z< 'A' || z > 'Z') || (h < '0' || h > '9')){
            throw new RuntimeException("Ungültiges Argument");
        }
        else {
            this.vorname = vorname;
            this.nachname = nachname;
            this.adresse = new Adresse(strasse,hausnummer,postleitzahl,ort);
        }
    }
}
