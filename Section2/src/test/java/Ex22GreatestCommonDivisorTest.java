import org.junit.Assert;
import org.junit.Test;

public class Ex22GreatestCommonDivisorTest {
    @Test
    public void getGreatestCommonDivisorTest(){
        Assert.assertEquals(6, Ex22GreatestCommonDivisior.getGreatestCommonDivisor(12,30));
        Assert.assertEquals(5, Ex22GreatestCommonDivisior.getGreatestCommonDivisor(25,15));
        Assert.assertEquals(-1, Ex22GreatestCommonDivisior.getGreatestCommonDivisor(9,18));
        Assert.assertEquals(9, Ex22GreatestCommonDivisior.getGreatestCommonDivisor(81,153));
    }
}
