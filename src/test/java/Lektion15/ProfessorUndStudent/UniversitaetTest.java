package Lektion15.ProfessorUndStudent;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class UniversitaetTest {
    @Test
    public void testStudent(){
        Person s1 = new Student("Programmieren");
        assertEquals(s1.taetigkeit,"Student");
        assertEquals(s1.fach,"Programmieren");
    }
    @Test
    public void testProfessor(){
        Person s1 = new Professor("Programmieren");
        assertEquals(s1.taetigkeit,"Professor");
        assertEquals(s1.fach,"Programmieren");
    }
    @Test
    public void testAusgabe(){
        //wie kann man die Konsolen-Ausgabe einer void-Methode testen?
    }

}
