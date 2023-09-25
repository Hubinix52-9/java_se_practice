import org.junit.Assert;
import org.junit.Test;

public class Ex17FirstAndLastDigitSumTest {
    @Test
    public void sumFirstAndLastDigitTest(){
        Assert.assertEquals(4, Ex17FirstAndLastDigitSum.sumFirstAndLastDigit(252));
        Assert.assertEquals(6, Ex17FirstAndLastDigitSum.sumFirstAndLastDigit(4132412));
        Assert.assertEquals(-1, Ex17FirstAndLastDigitSum.sumFirstAndLastDigit(-252));
        Assert.assertEquals(0, Ex17FirstAndLastDigitSum.sumFirstAndLastDigit(0));
    }
}
