import org.junit.Assert;
import org.junit.Test;

public class Ex23PerfectNumberTest {
    @Test
    public void isPerfectNumberTest(){
        Assert.assertTrue(Ex23PerfectNumber.isPerfectNumber(6));
        Assert.assertTrue(Ex23PerfectNumber.isPerfectNumber(28));
        Assert.assertFalse(Ex23PerfectNumber.isPerfectNumber(5));
        Assert.assertFalse(Ex23PerfectNumber.isPerfectNumber(-1));
    }
}
