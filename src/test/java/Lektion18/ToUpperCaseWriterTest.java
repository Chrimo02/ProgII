package Lektion18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import Lektion18.ToUpperCaseWriter.ToUpperCaseWriter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToUpperCaseWriterTest
{

  private ToUpperCaseWriter createToUpperCaseWriter(ByteArrayOutputStream baos) throws IOException {
    OutputStreamWriter osw = new OutputStreamWriter(baos);
    return new ToUpperCaseWriter(osw);
  }

  @Test
  public void writeCharTest() {
    try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
         ToUpperCaseWriter writer = createToUpperCaseWriter(baos)) {

      writer.write('a');
      writer.flush();
      String uppercase = baos.toString();
      assertEquals(uppercase, "A");
    } catch (IOException e) {
      fail("IOException" + e.getMessage());
    }
  }

  @Test
  public void writeCharTestWithNonChar() {
    try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
         ToUpperCaseWriter writer = createToUpperCaseWriter(baos)) {

      writer.write('1');
      writer.flush();
      String uppercase = baos.toString();
      assertEquals(uppercase, "1");
    } catch (IOException e) {
      fail("IOException" + e.getMessage());
    }
  }
  @Test
  public void TestCapitalA() {
    try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
         ToUpperCaseWriter writer = createToUpperCaseWriter(baos)) {

      writer.write('a');
      writer.flush();
      String result = baos.toString();
      assertEquals(result, "A");
    } catch (IOException e) {
      fail("IOException" + e.getMessage());
    }
  }
  @Test
  public void TestZahl() {
    try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
         ToUpperCaseWriter writer = createToUpperCaseWriter(baos)) {

      writer.write('1');
      writer.flush();
      String result = baos.toString();
      assertEquals(result, "1");
    } catch (IOException e) {
      fail("IOException" + e.getMessage());
    }
  }
  @Test
public void testKleinbuchstabenZuGrossbuchstaben() {
  try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
       ToUpperCaseWriter writer = createToUpperCaseWriter(baos)) {

    for (int i = 97; i <= 122; i++) {     // a-z
      char ch = (char) i;
      writer.write(ch);
    }
    writer.flush();
    String result = baos.toString();
    assertEquals(result, "ABCDEFGHIJKLMNOPQRSTUVWXYZ");
  } catch (IOException e) {
    fail("IOException" + e.getMessage());
  }
}
  @Test
  public void testAlleZeichenOhneKleinbuchstaben() {
    try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
         ToUpperCaseWriter writer = createToUpperCaseWriter(baos)) {

      for (int i = 0; i < 128; i++) {
        if (i < 97 || i > 122) {         // alles außer Kleinbuchstaben a-z
          char ch = (char) i;
          writer.write(ch);
        }
      }
      writer.flush();
      String result = baos.toString();
      String first128 = "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\u0008\t\n\u000B\u000C\r\u000E\u000F" +
              "\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F" +
              " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`{|}~\u007F";  //ASCII bis 128 ohne Kleinbuchstaben

      assertEquals(result, first128);
    } catch (IOException e) {
      fail("IOException" + e.getMessage());
    }
  }





}
