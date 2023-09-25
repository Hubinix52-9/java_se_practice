import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class LeapYearCalculatorTest {

    @Test
    public void isLeapYearTest() {

        Assertions.assertFalse(LeapYearCalculator.isLeapYear(1700));
        Assertions.assertFalse(LeapYearCalculator.isLeapYear(1800));
        Assertions.assertFalse(LeapYearCalculator.isLeapYear(1900));
        Assertions.assertTrue(LeapYearCalculator.isLeapYear(1600));
        Assertions.assertTrue(LeapYearCalculator.isLeapYear(2000));
        Assertions.assertTrue(LeapYearCalculator.isLeapYear(2400));
        Assertions.assertFalse(LeapYearCalculator.isLeapYear(0));
        Assertions.assertFalse(LeapYearCalculator.isLeapYear(10000));
        Assertions.assertFalse(LeapYearCalculator.isLeapYear(2017));
    }
}
