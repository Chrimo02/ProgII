package Lektion15.Quiz;

public class MultipleChoiceFrage extends Quizfrage{
    String[] antworten;
    public MultipleChoiceFrage(String fragenText, String... antworten){
        this.fragenText = fragenText;
        this.antworten = antworten;
    }
    @Override
    public void printQuizfrage(){
        char currentLetter = 'A';
        System.out.println("Fragentext:");
        System.out.println(this.fragenText + "\n");
        System.out.println("Antwortmöglichkeiten:");
        for (int i = 0; i<this.antworten.length;i++){
            System.out.println(currentLetter + ": " + this.antworten[i]);
            currentLetter++;
        }
        System.out.println();
    }
}
