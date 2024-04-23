package Lektion16.Muenzautomat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class WechselgeldTest {
    @Test
    public void testWechselgeld(){
        ProChangeCalculator testCalculator = new ProChangeCalculator();
        assertArrayEquals(new int[]{1,1,1,1,1,1,1,1}, testCalculator.getChange(3,88));
        assertArrayEquals(new int[]{2,1,1,1,1,1,1,1},testCalculator.getChange(5,88));
        assertArrayEquals(new int[]{2,0,0,1,1,1,0,1},testCalculator.getChange(4,36));
    }

}
