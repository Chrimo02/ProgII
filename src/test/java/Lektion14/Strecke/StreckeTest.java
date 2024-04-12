package Lektion14.Strecke;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StreckeTest {
    @Test
    public void testAsmallerB(){
        Strecke test11 = new Strecke(2,8);
        Strecke test12 = new Strecke(8,2);
        assertTrue(test11.A <= test11.B);
        assertTrue(test12.A <= test12.B);
    }
    @Test
    public void testNoOverlap(){
        Strecke test21 = new Strecke(1,5);
        Strecke test22 = new Strecke(6,10);
        assertFalse(Strecke.checkOverlap(test21,test22));
    }
    @Test
    public void testContactPoint(){
        Strecke test31 = new Strecke(5,8);
        Strecke test32 = new Strecke(3,5);
        assertFalse(Strecke.checkOverlap(test31,test32));
        assertFalse(Strecke.checkOverlap(test32,test31));
    }
    @Test
    public void testOverlap(){
        Strecke test41 = new Strecke(2,7);
        Strecke test42 = new Strecke(5,9);
        assertTrue(Strecke.checkOverlap(test41,test42));
        assertTrue(Strecke.checkOverlap(test42,test41));
    }
    @Test
    public void testStreckeToStringOutput(){
        Strecke test31 = new Strecke(2,8);
        Strecke test32 = new Strecke(4,4);
        assertEquals(test31.toString(),"2------8");
        assertEquals(test32.toString(),"4");
    }

}
