import org.junit.Assert;
import org.junit.Test;

public class Ex16NumberPalindromeTest {
    @Test
    public void isPalindromeTest(){
        Assert.assertTrue(Ex16NumberPalindrome.isPalindrome(151));
        Assert.assertTrue(Ex16NumberPalindrome.isPalindrome(1));
        Assert.assertTrue(Ex16NumberPalindrome.isPalindrome(15151));
        Assert.assertTrue(Ex16NumberPalindrome.isPalindrome(1551));
        Assert.assertFalse(Ex16NumberPalindrome.isPalindrome(123));
        Assert.assertFalse(Ex16NumberPalindrome.isPalindrome(130));
    }
}
