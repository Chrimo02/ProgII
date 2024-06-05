package Lektion19.ServerHangmanObject;

import java.io.Serializable;

public class AntwortObjekt implements Serializable {
    int verbleibendeVersuche;
    String solutionStatus;
    String clue;
    Boolean erraten;
    public AntwortObjekt(int versuche, char[] solutionStatus1, String clue, Boolean erraten){
        this.verbleibendeVersuche = versuche;
        this.solutionStatus = String.valueOf(solutionStatus1);
        this.clue = clue;
        this.erraten = erraten;
    }
    @Override
    public String toString(){
        return solutionStatus + "\n" + clue;
    }
}
