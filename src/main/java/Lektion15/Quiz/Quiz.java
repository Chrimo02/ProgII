package Lektion15.Quiz;

public class Quiz {
    static int fragenZahl = 0;
    Quizfrage[] fragen;
    public Quiz(){
        this.fragen = new Quizfrage[10];
    }
    public void erstelleQuizbogen(){
        for (int i = 0; i<fragenZahl;i++){
            this.fragen[i].printQuizfrage();
        }
    }
    public void addQuizfrage(Quizfrage q){
        if (fragenZahl <= this.fragen.length){
            this.fragen[fragenZahl] = q;
            if (fragenZahl < this.fragen.length)fragenZahl++;
        }
        else System.out.println("Das Quiz ist bereits mit der maximalen Anzahl an Fragen gefüllt!");
    }


}
