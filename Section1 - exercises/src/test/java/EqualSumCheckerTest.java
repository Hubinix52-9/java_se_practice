import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EqualSumCheckerTest {
    @Test
    public void hasEqualSumTest() {
        Assertions.assertTrue(EqualSumChecker.hasEqualSum(1,1,2));
        Assertions.assertTrue(EqualSumChecker.hasEqualSum(2,2,4));
        Assertions.assertFalse(EqualSumChecker.hasEqualSum(1,1,1));
        Assertions.assertTrue(EqualSumChecker.hasEqualSum(1,-1,0));
        Assertions.assertFalse(EqualSumChecker.hasEqualSum(-1,-1,2));
    }
}
