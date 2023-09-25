import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class BarkingDogTest {


    @Test
    public void shouldWakeUpTest() {

        Assertions.assertTrue(BarkingDog.shouldWakeUp(true, 23));
        Assertions.assertTrue(BarkingDog.shouldWakeUp(true, 1));
        Assertions.assertFalse(BarkingDog.shouldWakeUp(true, 14));
        Assertions.assertFalse(BarkingDog.shouldWakeUp(true, 24));
        Assertions.assertFalse(BarkingDog.shouldWakeUp(false, -1));
    }
}
