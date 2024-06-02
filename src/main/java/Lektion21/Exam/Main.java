package Lektion21.Exam;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Exam testExam = new Exam();
        try {
            testExam.readQuestions("/Users/christian/IdeaProjects/ProgII/src/main/resources/questions.csv");
            testExam.toTest("/Users/christian/IdeaProjects/ProgII/src/main/resources/header.txt","/Users/christian/IdeaProjects/ProgII/src/main/resources/test.tex");

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
