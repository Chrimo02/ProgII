package Lektion21.Baum;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {

    /*
    Was ist sinnvoll zu testen?

    - BinaryTree initialisieren und testen ob root == null
    - Element zu "leerem" BinaryTree hinzufügen und testen, ob dieses Element dann auch zum neuen root wird
    - String-BinaryTree initialisieren, einen root-String "B" adden, danach "A" und "C" adden und schauen ob A links und C rechts
    - Danach testen, ob mit der .print()-Methode die richtig sortierte Ausgabe "A B C" erfolgt
     */

    @Test
    public void testEmptyRoot(){
        BinaryTree<String> test = new BinaryTree<>();
        assertNull(test.root);
    }
    @Test
    public void testAddRoot(){
        BinaryTree<String> test = new BinaryTree<>();
        test.add("Das ist der neue Root");
        assertEquals("Das ist der neue Root",test.root.value);
    }
    @Test
    public void testSortedAdd(){
        BinaryTree<String> test = new BinaryTree<>();
        test.add("B");
        test.add("A");
        test.add("C");
        assertEquals(test.root.getLeft().value,"A");
        assertEquals(test.root.getRight().value,"C");
    }
    @Test
    public void testPrintTree(){
        BinaryTree<String> test = new BinaryTree<>();
        test.add("B");
        test.add("A");
        test.add("C");
        assertEquals("A B C",test.print());
    }



}
