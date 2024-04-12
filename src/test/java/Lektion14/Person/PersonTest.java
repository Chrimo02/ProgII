package Lektion14.Person;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void testPersonNormal(){
        Person p1 = new Person("Klaus","Augenthaler","Säbenerstrasse","51",81547,"München");
    }

    @Test
    public void testPersonFirstname(){
        try {
            Person p2 = new Person("klaus","Augenthaler","Säbenerstrasse","51",81547,"München");
            fail("Runtime Exception erwartet");
        }
        catch (RuntimeException e){
            String errorMessage = e.getMessage();
            assertEquals(errorMessage,"Ungültiges Argument");

        }
    }
    @Test
    public void testPersonStreet(){
        try {
            Person p3 = new Person("Klaus","Augenthaler","säbenerstrasse","51",81547,"München");
            fail("Runtime Exception erwartet");
        }
        catch (RuntimeException e){
            String errorMessage = e.getMessage();
            assertEquals(errorMessage,"Ungültiges Argument");
        }
    }
    @Test
    public void testPersonCity(){
        try {
            Person p4 = new Person("Klaus","Augenthaler","Säbenerstrasse","51",81547,"münchen");
            fail("Runtime Exception erwartet");
        }
        catch (RuntimeException e){
            String errorMessage = e.getMessage();
            assertEquals(errorMessage,"Ungültiges Argument");
        }
    }
    @Test
    public void testPersonPostalCode(){
        try {
            Person p5 = new Person("Klaus","Augenthaler","Säbenerstrasse","Z51",81547,"münchen");
            fail("Runtime Exception erwartet");
        }
        catch (RuntimeException e){
            String errorMessage = e.getMessage();
            assertEquals(errorMessage,"Ungültiges Argument");
        }
    }


}
