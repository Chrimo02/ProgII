package SS2020.Aufgabe1;
import Prüfungsvorbereitung.SS2020.Aufgabe1.Konfigurator;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
public class MapKonfigTest {
    @Test
    public void testMapKonfig(){
        Map<String, String> map = Konfigurator.mapKonfiguration();
        String key1 = "mail.transport.protocol";
        String key2 = "password";
        assertTrue(map.containsKey(key1));
        assertTrue(map.containsKey(key2));
        assertEquals(map.get(key1),"smtp");
        assertEquals(map.get(key2),"K[O8a}5#");
    }

}
