import org.junit.Assert;
import org.junit.Test;

import java.awt.font.NumericShaper;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class NumberInWordTest {
    @Test
    public void printNumberInWordTest() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        NumberInWord.printNumberInWord(0);
        System.setOut(originalOut);
        Assert.assertEquals("ZERO", outputStream.toString().trim());

        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        NumberInWord.printNumberInWord(5);
        System.setOut(originalOut);
        Assert.assertEquals("FIVE", outputStream.toString().trim());

        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        NumberInWord.printNumberInWord(13);
        System.setOut(originalOut);
        Assert.assertEquals("OTHER", outputStream.toString().trim());

        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        NumberInWord.printNumberInWord(-3);
        System.setOut(originalOut);
        Assert.assertEquals("OTHER", outputStream.toString().trim());
    }
}
