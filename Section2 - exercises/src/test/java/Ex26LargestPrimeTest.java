import org.junit.Assert;
import org.junit.Test;

public class Ex26LargestPrimeTest {
    @Test
    public void getLargestPrimeTest(){
        Assert.assertEquals(7, Ex26LargestPrime.getLargestPrime(21));
        Assert.assertEquals(31, Ex26LargestPrime.getLargestPrime(217));
        Assert.assertEquals(5, Ex26LargestPrime.getLargestPrime(5));
        Assert.assertEquals(-1, Ex26LargestPrime.getLargestPrime(-21));
    }
    @Test
    public void isPrimeTest(){
        Assert.assertTrue(Ex26LargestPrime.isPrime(17));
        Assert.assertTrue(Ex26LargestPrime.isPrime(2));
        Assert.assertFalse(Ex26LargestPrime.isPrime(-1));
        Assert.assertFalse(Ex26LargestPrime.isPrime(15));
    }
}
