import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositiveNegativeZeroTest {
    @Test
    public void positive_zero_negativeTest() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        PositiveNegativeZero.positive_zero_negative(43);
        System.setOut(originalOut);
        assertEquals("Positive", outputStream.toString().trim());

        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        PositiveNegativeZero.positive_zero_negative(-4331);
        System.setOut(originalOut);
        assertEquals("Negative", outputStream.toString().trim());

        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        PositiveNegativeZero.positive_zero_negative(0);
        System.setOut(originalOut);
        assertEquals("Equal", outputStream.toString().trim());
    }
}
