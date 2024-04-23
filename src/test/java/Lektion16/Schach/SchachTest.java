package Lektion16.Schach;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SchachTest {

    @Test
    public void testDame(){
        LaeuferImpl testLauefer = new LaeuferImpl(4,4);
        TurmImpl testTurm = new TurmImpl(4,4);
        Dame testDame =  new Dame(4,4);
        Brett testBrett = testDame.gibErlaubteFelder();
        Brett vergleichsBrett = testTurm.gibErlaubteFelder().kombiniere(testLauefer.gibErlaubteFelder());
        assertArrayEquals(vergleichsBrett.brett,testBrett.brett);
    }

    /*
    händisches 2D-Boolean Array erstellen um richgtige Felder zu prüfen, damit auch false-Felder geprüft werden --> sau aufwändig aber notwendig :D
     */

}
