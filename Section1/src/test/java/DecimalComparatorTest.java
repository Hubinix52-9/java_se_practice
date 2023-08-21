import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class DecimalComparatorTest {
    @Test
    public void areEqualByThreeDecimalPlacesTest() {
        Assertions.assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(3.124, 3.124));
        Assertions.assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(3.124, 3.125));
        Assertions.assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(3.123, 3.1245));
        Assertions.assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(3.1, 3.1));
        Assertions.assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(3, 3.124));
    }
}
