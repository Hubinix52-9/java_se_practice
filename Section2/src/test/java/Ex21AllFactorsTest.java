import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Ex21AllFactorsTest {
    @Test
    public void printFactors(){
        String result = getOutput(6);
        Assert.assertEquals("1 2 3 6", result);

        result = getOutput(32);
        Assert.assertEquals("1 2 4 8 16 32", result);

        result = getOutput(10);
        Assert.assertEquals("1 2 5 10", result);

        result = getOutput(-1);
        Assert.assertEquals("Invalid value", result);
    }
    public static String getOutput(int numb){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        Ex21AllFactors.printFactors(numb);
        System.setOut(originalOut);
        return outputStream.toString().trim();

    }
}
