import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Ex24NumberToWordsTest {
    @Test
    public void numberToWordsTest(){
        String result = getOutput(234);
        Assert.assertEquals("TWO THREE FOUR", result);

        result = getOutput(100);
        Assert.assertEquals("ONE ZERO ZERO", result);

        result = getOutput(110);
        Assert.assertEquals("ONE ONE ZERO", result);

        result = getOutput(432);
        Assert.assertEquals("FOUR THREE TWO", result);

        result = getOutput(-432);
        Assert.assertEquals("Invalid value", result);

        result = getOutput(5);
        Assert.assertEquals("FIVE", result);

        result = getOutput(54);
        Assert.assertEquals("FIVE FOUR", result);
    }

    @Test
    public void reverseTest(){
        Assert.assertEquals(432,Ex24NumberToWords.reverse(234));
        Assert.assertEquals(45321,Ex24NumberToWords.reverse(12354));
        Assert.assertEquals(-432,Ex24NumberToWords.reverse(-234));
    }

    @Test
    public void getDigitCount(){
        Assert.assertEquals(3, Ex24NumberToWords.getDigitCount(254));
        Assert.assertEquals(1, Ex24NumberToWords.getDigitCount(5));
        Assert.assertEquals(2, Ex24NumberToWords.getDigitCount(54));
        Assert.assertEquals(-1, Ex24NumberToWords.getDigitCount(-254));
    }
    public static String getOutput(int numb){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        Ex24NumberToWords.numberToWords(numb);
        System.setOut(originalOut);
        return outputStream.toString().trim();

    }
}
