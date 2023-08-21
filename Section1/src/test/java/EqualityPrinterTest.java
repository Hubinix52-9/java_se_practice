import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EqualityPrinterTest {
    @Test
    public void printEqualTest(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        EqualityPrinter.printEqual(1,1,1);
        System.setOut(originalOut);
        assertEquals("All numbers are equal", outputStream.toString().trim());

        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        EqualityPrinter.printEqual(1,2,3);
        System.setOut(originalOut);
        assertEquals("All numbers are different", outputStream.toString().trim());

        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        EqualityPrinter.printEqual(1,2,1);
        System.setOut(originalOut);
        assertEquals("Neither all are equal or different", outputStream.toString().trim());

        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        EqualityPrinter.printEqual(-1,2,1);
        System.setOut(originalOut);
        assertEquals("Invalid value", outputStream.toString().trim());
    }
}
