package Lektion14.Punkt;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class PunktTest {

    @Test
    public void testPunktNormal(){
        Punkt p1 = new Punkt(5,5);
        p1.verschiebePunkt(300,400);
    }

    @Test
    public void testErrorNegative(){
        Punkt p1 = new Punkt(5,5);
        try
        {
            p1.verschiebePunkt(-1,-2);
            fail("Runtime Exception erwartet");
        }
        catch (RuntimeException e){
            String errorMessage = e.getMessage();
            assertEquals(errorMessage,"Ungültiges Argument");
        }
    }
    @Test
    public void testErrorX(){
        Punkt p1 = new Punkt(5,5);
        try
        {
            p1.verschiebePunkt(1921,400);
            fail("Runtime Exception erwartet");
        }
        catch (RuntimeException e){
            String errorMessage = e.getMessage();
            assertEquals(errorMessage,"Ungültiges Argument");
        }
    }
    @Test
    public void testErrorY(){
        Punkt p1 = new Punkt(5,5);
        try
        {
            p1.verschiebePunkt(300,1081);
            fail("Runtime Exception erwartet");
        }
        catch (RuntimeException e){
            String errorMessage = e.getMessage();
            assertEquals(errorMessage,"Ungültiges Argument");
        }
    }

}
