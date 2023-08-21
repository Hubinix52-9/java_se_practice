import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Ex43ReverseArrayTest {
    private static Ex43ReverseArray reverse;
    @Before
    public void setUp() {
        reverse = new Ex43ReverseArray();
    }
    @Test
    public void reverseTest(){
        int[] array = {1,2,3,4,5,6,7};
        String expectedValue = "Array = [1, 2, 3, 4, 5, 6, 7, ]\nReversed array = [7, 6, 5, 4, 3, 2, 1, ]\n";
        String result = capturePrintOutput(array);
        Assert.assertEquals(expectedValue, result);
    }
    private static String capturePrintOutput(int []array) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        reverse.reverse(array);
        System.setOut(originalOut);
        return outputStream.toString();
    }
}
