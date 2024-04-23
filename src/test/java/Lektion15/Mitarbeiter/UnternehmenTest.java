package Lektion15.Mitarbeiter;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

public class UnternehmenTest {

    @Test
    public void testGehaltsfaktorAngestellter(){
        Angestellter a1 = new Angestellter("Clint","Dempsey",10000,"01.01.2000");
        assertEquals(a1.gehaltsfaktor,1.0);
    }
    @Test
    public void testGehaltsfaktorAbteilungsleiter(){
        Abteilungsleiter aL1 = new Abteilungsleiter("Pep","Guardiola",35000,"02.02.2002");
        assertEquals(aL1.gehaltsfaktor, 2.0);
    }
    @Test
    public void testBefoerderung(){
        Angestellter a1 = new Angestellter("Clint","Dempsey",10000,"01.01.2000");
        Abteilungsleiter aL1 = new Abteilungsleiter("Pep","Guardiola",35000,"02.02.2002");
        aL1.befoerdern(a1);
        assertEquals(1.1,a1.gehaltsfaktor);
    }

    //Besser wäre es noch, wenn mehrfache Beförderung getestet wird

}
