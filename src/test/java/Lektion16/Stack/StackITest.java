package Lektion16.Stack;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StackITest {
    static String x = "Objekt A";
    static String y = "Objekt B";
    static String z = "Objekt C";
    @Test
    public void testPush(){
        StackIImpl testStack = new StackIImpl();
        testStack.push(x);
        assertEquals(x,testStack.stack.get(0));
        testStack.push(y);
        assertEquals(y,testStack.stack.get(1));
        testStack.push(z);
        assertEquals(z,testStack.stack.get(2));
    }

    @Test
    public void testPop(){
        StackIImpl testStack = new StackIImpl();
        testStack.push(x);
        testStack.push(y);
        testStack.push(z);
        assertEquals(z,testStack.pop());
        assertEquals(y,testStack.pop());
        assertEquals(x,testStack.pop());
    }

    @Test
    public void testPopEmptyStack(){
        StackIImpl testStack = new StackIImpl();
        try{
            testStack.pop();
            fail ("RuntimeException erwartet!");
        }
        catch (RuntimeException e){
            String errorMessage = e.getMessage();
            assertEquals(errorMessage,"Der Stack ist bereits leer!");
        }
    }
}
