import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MegaBytesConverterTest {

    @Test
    public void printMegaBytesAndKiloBytesTest() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        MegaBytesConverter.printMegaBytesAndKiloBytes(2354324);
        System.setOut(originalOut);
        assertEquals("2354324 KB = 2299 MB and 148 KB", outputStream.toString().trim());

        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1000);
        System.setOut(originalOut);
        assertEquals("Invalid data", outputStream.toString().trim());

        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        System.setOut(originalOut);
        assertEquals("5000 KB = 4 MB and 904 KB", outputStream.toString().trim());
    }
}


