package Lektion15.Quiz;

public class Textfrage extends Quizfrage {
    public Textfrage(String fragenText){
        this.fragenText = fragenText;
    }
    @Override
    public void printQuizfrage(){
        System.out.println(this.fragenText + "\n");
        System.out.println("Antwort:\n\n");
    }

}
