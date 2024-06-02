package Lektion21.Exam;

public class Question {
    String text; //Fragentext

    //Wandelt eine eingelesene Zeile in ein Question-Objekt um
    public static Question toQuestion(String line){
        return new Question(line);
    }
    public Question(String text){
        this.text = text;
    }
}
