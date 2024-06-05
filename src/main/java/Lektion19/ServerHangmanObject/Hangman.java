package Lektion19.ServerHangmanObject;

import java.io.*;

public class Hangman {
    private int verbleibendeVersuche;
    private final String loesungswort;
    char[] solutionStatus;
    String clue;
    Boolean treffer;
    Boolean erraten;
    public Hangman(){
        this.verbleibendeVersuche = 16;
        //this.loesungswort = chooseGame();
        this.loesungswort = "Test";
        this.erraten = false;
        this.treffer = false;
        this.solutionStatus = new char[loesungswort.length()];
        for (int i = 0; i < this.loesungswort.length(); i++) {
            this.solutionStatus[i] = '_';
        }
    }

    public void play(ObjectOutputStream oos, ObjectInputStream ois) throws IOException, ClassNotFoundException
    {
        if (verbleibendeVersuche == 16) {
            this.clue = "Willkommen beim Hangman-Spiel, Sie haben 15 Versuche um das Lösungswort zu erraten\nBitte geben Sie nun Ihren ersten Buchstabentipp ein: ";
            oos.writeObject(new AntwortObjekt(verbleibendeVersuche, solutionStatus, clue, erraten));
            oos.flush();
            verbleibendeVersuche--;
            //return;
        } else {
            if (!erraten && verbleibendeVersuche > 0) {
                ClientGuess nextGuess = (ClientGuess) ois.readObject();
                replaceLetter(nextGuess.guess);
                verbleibendeVersuche--;

                if (String.valueOf(solutionStatus).equalsIgnoreCase(loesungswort)) {
                    erraten = true;
                    this.clue = "Herzlichen Glückwunsch, Sie haben gewonnen!\n" + "Das Wort war: " + this.loesungswort;
                    oos.writeObject(new AntwortObjekt(verbleibendeVersuche, solutionStatus, clue, true));
                    oos.flush();
                    return;
                } else {
                    if (this.treffer) {
                        this.clue = "Das war ein Treffer :D\nSie haben noch " + verbleibendeVersuche + " Versuche übrig.\nBitte geben Sie Ihren nächsten Buchstabentipp ein: ";
                        oos.writeObject(new AntwortObjekt(verbleibendeVersuche, solutionStatus, clue, erraten));
                        oos.flush();
                        return;
                    } else {
                        this.clue = "Das war leider nichts :/\nSie haben noch " + verbleibendeVersuche + " Versuche übrig.\nBitte geben Sie Ihren nächsten Buchstabentipp ein: ";
                        oos.writeObject(new AntwortObjekt(verbleibendeVersuche, solutionStatus, clue, erraten));
                        oos.flush();
                        return;
                    }
                }
            }
            this.clue = "Sie haben leider verloren, das Lösungswort war: " + loesungswort;
            oos.writeObject(new AntwortObjekt(verbleibendeVersuche,solutionStatus,clue,erraten));
            oos.flush();
        }
    }



    public void replaceLetter(char c){
        this.treffer = false;
        for (int k = 0; k < loesungswort.length(); k++)
        {
            if (loesungswort.charAt(k) == c || loesungswort.charAt(k) == c-32 || loesungswort.charAt(k) == c+32) {
                solutionStatus[k] = c;
                this.treffer = true;
            }
        }
    }
    public static String chooseGame(){
        String[] wortspeicher = new String[] {"COMPUTER","SONNENBLUME","ABENTEUER","SCHMETTERLING",
                "GITARRE","BIBLIOTHEK","ELEFANT","WASSERMELONE","BERGSTEIGEN","GEHEIMNIS","REGENBOGEN","ZIRKUS",
                "RUCKSACK","ZAUBEREI","ASTRONAUT","OZEAN","KAKTUS","PIZZA","QUOTIENT","EICHHOERNCHEN"};
        int random = (int) (Math.random()*wortspeicher.length);
        return wortspeicher[random];
    }

}
