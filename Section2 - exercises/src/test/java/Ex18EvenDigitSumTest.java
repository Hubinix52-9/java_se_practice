import org.junit.Assert;
import org.junit.Test;

public class Ex18EvenDigitSumTest {
    @Test
    public void getEvenDigitSum(){
        Assert.assertEquals(5, Ex18EvenDigitSum.getEvenDigitSum(2213));
        Assert.assertEquals(12, Ex18EvenDigitSum.getEvenDigitSum(2993));
        Assert.assertEquals(-1, Ex18EvenDigitSum.getEvenDigitSum(-2213));
    }
}
