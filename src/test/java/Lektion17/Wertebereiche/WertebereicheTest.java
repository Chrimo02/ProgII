package Lektion17.Wertebereiche;
import  static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.io.FileOutputStream;
import java.io.IOException;

public class WertebereicheTest {

    /* Sinnvolle Einschränkungen:
        - b[]: sollte nicht null sein (sonst "NullPointerException") und länge sollte größe off+len sein (sonst "IndexOutOfBounds")
        - off: nicht negativ + kleiner als b[].length
        - len: nicht negativ + summe von off+len muss kleiner sein als b[].length
     */

    @Test
    public void testByteNull(){
        try (FileOutputStream fos = new FileOutputStream("testfile.txt")) {
            assertThrows(NullPointerException.class, () -> fos.write(null, 0, 0));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testNegativeOffset(){
        try (FileOutputStream fos = new FileOutputStream("testfile.txt")) {
            byte[] data = new byte[4];
            assertThrows(IndexOutOfBoundsException.class, () -> fos.write(data, -1, 0));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testBiggerOffset(){
        try (FileOutputStream fos = new FileOutputStream("testfile.txt")) {
            byte[] data = new byte[4];
            assertThrows(IndexOutOfBoundsException.class, () -> fos.write(data, 5, 0));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testNegativeLength(){
        try (FileOutputStream fos = new FileOutputStream("testfile.txt")) {
            byte[] data = new byte[4];
            assertThrows(IndexOutOfBoundsException.class, () -> fos.write(data, 0, -1));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testBiggerLength(){

        try (FileOutputStream fos = new FileOutputStream("testfile.txt")) {
            byte[] data = new byte[4];
            assertThrows(IndexOutOfBoundsException.class, () -> fos.write(data, 0,5));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testOffLenSumToBig(){

        try (FileOutputStream fos = new FileOutputStream("testfile.txt")) {
            byte[] data = new byte[4];
            assertThrows(IndexOutOfBoundsException.class, () -> fos.write(data,2,3));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

