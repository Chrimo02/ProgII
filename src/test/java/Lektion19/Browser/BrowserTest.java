package Lektion19.Browser;
import org.junit.jupiter.api.Test;


import java.net.URL;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class BrowserTest {
    @Test
    public void testURL() {
        Browser browser = new Browser();
        Optional<URL> back = browser.back();
        if (back.isPresent()) {
            URL url = back.get();
            assertEquals(browser.retrieveSite(url),"http://google.de");
        }
        else assertEquals(Optional.empty(), back);

    }
}
