import org.junit.Assert;
import org.junit.Test;

public class NumberOfDaysInMonthTest {
    @Test
    public void isLeapYearTest(){
        Assert.assertTrue(NumberOfDaysInMonth.isLeapYear(1600));
        Assert.assertTrue(NumberOfDaysInMonth.isLeapYear(2000));
        Assert.assertTrue(NumberOfDaysInMonth.isLeapYear(2016));
        Assert.assertFalse(NumberOfDaysInMonth.isLeapYear(-1600));
        Assert.assertFalse(NumberOfDaysInMonth.isLeapYear(2017));
    }
    @Test
    public void getDaysInMonth(){
        Assert.assertEquals(31, NumberOfDaysInMonth.getDaysInMonth(1, 2020));
        Assert.assertEquals(29, NumberOfDaysInMonth.getDaysInMonth(2, 2016));
        Assert.assertEquals(28, NumberOfDaysInMonth.getDaysInMonth(2, 2013));
        Assert.assertEquals(-1, NumberOfDaysInMonth.getDaysInMonth(-2, 2016));
        Assert.assertEquals(29, NumberOfDaysInMonth.getDaysInMonth(2, 1600));
    }
}
