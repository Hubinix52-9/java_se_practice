import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Ex27InputCalculatorTest {

    @Test
    public void testInputThenPrintSumAndAverage() {
        Assert.assertEquals("SUM = 15 AVG = 3", getOutput("1\n2\n3\n4\n5\na\n"));
        Assert.assertEquals("SUM = 5 AVG = 1", getOutput("1\n1\n1\n1\n1\na\n"));
        Assert.assertEquals("SUM = 5 AVG = 5", getOutput("5\na\n3\n4\n5\na\n"));
    }
    public static String getOutput(String yourValues){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        String input = yourValues;
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        Ex27InputCalculator.inputThenPrintSumAndAverage();
        System.setOut(originalOut);
        return outputStream.toString().trim();

    }
}
