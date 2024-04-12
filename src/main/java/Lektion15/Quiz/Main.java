package Lektion15.Quiz;

public class Main {
    public static void main(String[] args) {
        Quizfrage q1 = new Textfrage("Was ist die Hauptstadt von Deutschland?");
        Quizfrage q2 = new MultipleChoiceFrage("In welchem Jahr gewann der FC Bayern mit Jupp Heynkes die Champions League?","2010","2012","2013","2011");
        Quizfrage q3 = new Textfrage("Was ist die Hauptstadt von Italien?");
        Quizfrage q4 = new MultipleChoiceFrage("Wie viele Ecken hat ein Viereck?","1","2","3","5","keine der Antworten ist richtig");
        Quizfrage q5 = new MultipleChoiceFrage("Wieviel Gramm sind 3,5 Meter?","5000","3500","35","keine der Antworten ist richtig");
        Quiz myQuiz = new Quiz();
        myQuiz.addQuizfrage(q1);
        myQuiz.addQuizfrage(q2);
        myQuiz.addQuizfrage(q3);
        myQuiz.addQuizfrage(q4);
        myQuiz.addQuizfrage(q5);
        myQuiz.erstelleQuizbogen();
    }



}
