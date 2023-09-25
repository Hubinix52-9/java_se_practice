import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinutesToYearsAndDaysCalculatorTest {
    @Test
    public void printYearsAndDaysTest() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        MinutesToYearsAndDaysCalculator.printYearsAndDays(525600);
        System.setOut(originalOut);
        assertEquals("525600 min = 1 y and 0 d", outputStream.toString().trim());

        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        MinutesToYearsAndDaysCalculator.printYearsAndDays(1051200);
        System.setOut(originalOut);
        assertEquals("1051200 min = 2 y and 0 d", outputStream.toString().trim());

        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        MinutesToYearsAndDaysCalculator.printYearsAndDays(561600);
        System.setOut(originalOut);
        assertEquals("561600 min = 1 y and 25 d", outputStream.toString().trim());

        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        MinutesToYearsAndDaysCalculator.printYearsAndDays(-5);
        System.setOut(originalOut);
        assertEquals("Invalid value", outputStream.toString().trim());
    }
}
