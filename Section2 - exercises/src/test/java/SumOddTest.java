import org.junit.Assert;
import org.junit.Test;

public class SumOddTest {
    @Test
    public void isOddTest(){
        Assert.assertTrue(SumOdd.isOdd(25));
        Assert.assertTrue(SumOdd.isOdd(1));
        Assert.assertFalse(SumOdd.isOdd(0));
        Assert.assertFalse(SumOdd.isOdd(4));
    }
    @Test
    public void sumOddTest(){
        Assert.assertEquals(2500, SumOdd.sumOdd(1,100));
        Assert.assertEquals(-1, SumOdd.sumOdd(-1,100));
        Assert.assertEquals(0, SumOdd.sumOdd(100,100));
        Assert.assertEquals(13, SumOdd.sumOdd(13,13));
    }
}
