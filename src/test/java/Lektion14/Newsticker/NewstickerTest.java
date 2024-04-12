package Lektion14.Newsticker;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class NewstickerTest {
    @Test
    public void testNoValidLength(){
        Ticker t1 = new Ticker(0);
        Ticker t12 = new Ticker(-1);
        assertEquals(t1.getGroesse(),200);
        assertEquals(t12.getGroesse(),200);
    }

}
