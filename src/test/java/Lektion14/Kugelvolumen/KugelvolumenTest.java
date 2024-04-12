package Lektion14.Kugelvolumen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KugelvolumenTest {

    @Test
    public void testKugelvolumenZero(){
        Assertions.assertEquals(0, Kugelvolumen.berechneKugelvolumen(0)); //berechne Methode mit delta (z.B. 0,0001) überladne, dann muss nicht gerundet werden
    }

    @Test
    public void testKugelvolumenOne(){
        assertEquals(4.189,Kugelvolumen.berechneKugelvolumen(1));

    }

    @Test
    public void testKugelvolumenFive(){
        assertEquals(523.599,Kugelvolumen.berechneKugelvolumen(5));
    }

    @Test
    public void testKugelvolumenNegative(){
        assertEquals(-1,Kugelvolumen.berechneKugelvolumen(-1));
    }
}


