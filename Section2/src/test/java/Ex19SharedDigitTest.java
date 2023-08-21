import org.junit.Assert;
import org.junit.Test;

public class Ex19SharedDigitTest {
    @Test
    public void hasSharedDigitTest(){
        Assert.assertTrue(Ex19SharedDigit.hasSharedDigit(12,15));
        Assert.assertFalse(Ex19SharedDigit.hasSharedDigit(12,64));
        Assert.assertFalse(Ex19SharedDigit.hasSharedDigit(12,35));
        Assert.assertFalse(Ex19SharedDigit.hasSharedDigit(8,35));
        Assert.assertFalse(Ex19SharedDigit.hasSharedDigit(15,100));


    }
}
