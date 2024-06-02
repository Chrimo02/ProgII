package Lektion21.Webseitenabruf;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Webseitenaufruf {
    public static void main(String[] args) {
        /*Response response = ClientBuilder.newClient()
                .target("https://en.wikipedia.org/")
                .path("wiki/Fluent_interface")
                .request(MediaType.TEXT_HTML)
                .get();
        String s = response.readEntity(String.class);
        System.out.println(s);

         */
        /*
        Client newClient = ClientBuilder.newClient();
        WebTarget target = newClient.target("https://jsonplaceholder.typicode.com/");
        target = target.path("posts/1");
        Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON_TYPE);
        Response response = builder.get();
        String s = response.readEntity(String.class);
        System.out.println(s);

         */
        Response response = ClientBuilder.newClient().target("https://jsonplaceholder.typicode.com/").path("posts/1").request(MediaType.APPLICATION_JSON_TYPE).get();
        String s2 = response.readEntity(String.class);
        System.out.println(s2);
    }

}
