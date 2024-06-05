package Lektion23.ComparatorAndConsumer;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;
import java.util.function.Consumer;

public class Browser {
    public Optional<URL> back()
    {
        try
        {
            //simulate: fetch last URL from Stack
            return Math.random() < 0.5 ? Optional.of(new URL("http://google.de")) : Optional.empty();

        }
        catch(MalformedURLException e)
        {
            return Optional.empty();
        }
    }
    public String retrieveSite(URL url)
    {
        //simulate download site:
        return url.toString();
    }
    public static void main(String[] args)
    {
        System.out.println("Normal back");
        Browser browser = new Browser();
        Optional<URL> back = browser.back();
        back.ifPresent(url -> browser.retrieveSite(url));
    }
}
