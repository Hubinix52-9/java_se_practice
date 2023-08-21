import org.junit.Assert;
import org.junit.Test;

public class Ex20LastDigitCheckerTest {
    @Test
    public void hasSameDigitTest(){
        Assert.assertTrue(Ex20LastDigitChecker.hasSameLastDigit(41,22,71));
        Assert.assertTrue(Ex20LastDigitChecker.hasSameLastDigit(23,32,42));
        Assert.assertFalse(Ex20LastDigitChecker.hasSameLastDigit(9,22,71));
        Assert.assertFalse(Ex20LastDigitChecker.hasSameLastDigit(41,22,73));
        Assert.assertFalse(Ex20LastDigitChecker.hasSameLastDigit(41,22,1001));

    }
    @Test
    public void isValidTest(){
        Assert.assertTrue(Ex20LastDigitChecker.isValid(50));
        Assert.assertFalse(Ex20LastDigitChecker.isValid(9));
        Assert.assertFalse(Ex20LastDigitChecker.isValid(1001));

    }
}
