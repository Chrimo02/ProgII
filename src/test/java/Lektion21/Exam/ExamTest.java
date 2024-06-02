package Lektion21.Exam;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExamTest {
    @Test
    public void testToTest() throws IOException{
        Exam testExam = new Exam();
        testExam.readQuestions("/Users/christian/IdeaProjects/ProgII/src/main/resources/questions.csv");
        testExam.toTest("/Users/christian/IdeaProjects/ProgII/src/main/resources/header.txt","/Users/christian/IdeaProjects/ProgII/src/main/resources/test.tex");
        File testFile = new File("/Users/christian/IdeaProjects/ProgII/src/main/resources/test.tex");
        assertTrue(testFile.exists());
    }
}
