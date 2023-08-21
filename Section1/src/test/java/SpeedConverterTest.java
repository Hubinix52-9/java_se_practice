import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpeedConverterTest {
    @Test
    public void printConversionTest() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        SpeedConverter.printConversion(1.5);
        System.setOut(originalOut);
        assertEquals("1.5 km/h = 1 mi/h", outputStream.toString().trim());

        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        SpeedConverter.printConversion(10.25);
        System.setOut(originalOut);
        assertEquals("10.25 km/h = 6 mi/h", outputStream.toString().trim());

        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        SpeedConverter.printConversion(-5.6);
        System.setOut(originalOut);
        assertEquals("Invald value", outputStream.toString().trim());

        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        SpeedConverter.printConversion(25.42);
        System.setOut(originalOut);
        assertEquals("25.42 km/h = 16 mi/h", outputStream.toString().trim());

        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        SpeedConverter.printConversion(75.114);
        System.setOut(originalOut);
        assertEquals("75.114 km/h = 47 mi/h", outputStream.toString().trim());
    }
    @Test
    public void toMilesPerHourTest() {

        assertEquals(1, SpeedConverter.toMilesPerHour(1));
        assertEquals(6, SpeedConverter.toMilesPerHour(10.25));
        assertEquals(-1, SpeedConverter.toMilesPerHour(-5.6));
        assertEquals(16, SpeedConverter.toMilesPerHour(25.42));
        assertEquals(47, SpeedConverter.toMilesPerHour(75.114));
    }


}
