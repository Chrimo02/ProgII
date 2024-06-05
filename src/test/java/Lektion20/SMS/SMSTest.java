package Lektion20.SMS;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SMSTest {
    TastenMap tasten = new TastenMap();
    // TODO: Es sollten alle möglichen Eingaben getestet werden, nicht nur Stichproben
    @Test
    public void testInvalidChar(){
        assertThrows(IllegalTelephoneNumberException.class, () -> tasten.get('+'));
    }
    @Test
    public void testSuccess(){
        try {
            assertEquals('2',tasten.get('A'));
        }
        catch (IllegalTelephoneNumberException e){
            fail();
        }
    }


}
