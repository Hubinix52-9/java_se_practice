import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TeenNumberCheckerTest {
    @Test
    public void hasTeenTest(){
        Assertions.assertTrue(TeenNumberChecker.hasTeen(5, 3, 15));
        Assertions.assertTrue(TeenNumberChecker.hasTeen(17, 16, 15));
        Assertions.assertFalse(TeenNumberChecker.hasTeen(5, 3, 1));
    }
}
