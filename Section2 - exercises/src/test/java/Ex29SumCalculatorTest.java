import org.junit.Assert;
import org.junit.Test;

public class Ex29SumCalculatorTest {
    @Test
    public void getAndSetFirstNumberTest(){
        Ex29SumCalculator calc = new Ex29SumCalculator();

        calc.setFirstNumber(5);
        Assert.assertEquals(5, calc.getFirstNumber(), 0.1 );

        calc.setFirstNumber(4.65);
        Assert.assertEquals(4.6, calc.getFirstNumber(), 0.1 );

        calc.setFirstNumber(-4.5);
        Assert.assertEquals(-4.5, calc.getFirstNumber(), 0.1 );
    }

    @Test
    public void getAndSetSecondNumberTest(){
        Ex29SumCalculator calc = new Ex29SumCalculator();

        calc.setSecondNumber(5);
        Assert.assertEquals(5, calc.getSecondNumber(), 0.1 );

        calc.setSecondNumber(4.65);
        Assert.assertEquals(4.6, calc.getSecondNumber(), 0.1 );

        calc.setSecondNumber(-4.5);
        Assert.assertEquals(-4.5, calc.getSecondNumber(), 0.1 );
    }

    @Test
    public void getAdditionResultTest(){
        Ex29SumCalculator calc = new Ex29SumCalculator();

        calc.setFirstNumber(3);
        calc.setSecondNumber(5);
        Assert.assertEquals(8, calc.getAdditionResult(), 0.1 );

        calc.setFirstNumber(-3);
        calc.setSecondNumber(5);
        Assert.assertEquals(2, calc.getAdditionResult(), 0.1 );

        calc.setFirstNumber(0);
        calc.setSecondNumber(5);
        Assert.assertEquals(5, calc.getAdditionResult(), 0.1 );
    }
    @Test
    public void getSubtractionResultTest(){
        Ex29SumCalculator calc = new Ex29SumCalculator();

        calc.setFirstNumber(3);
        calc.setSecondNumber(5);
        Assert.assertEquals(-2, calc.getSubtractionResult(), 0.1 );

        calc.setFirstNumber(-3);
        calc.setSecondNumber(5);
        Assert.assertEquals(-8, calc.getSubtractionResult(), 0.1 );

        calc.setFirstNumber(0);
        calc.setSecondNumber(5);
        Assert.assertEquals(-5, calc.getSubtractionResult(), 0.1 );
    }
    @Test
    public void getMultiplicationResultTest(){
        Ex29SumCalculator calc = new Ex29SumCalculator();

        calc.setFirstNumber(3);
        calc.setSecondNumber(5);
        Assert.assertEquals(15, calc.getMultiplicationResult(), 0.1 );

        calc.setFirstNumber(-3);
        calc.setSecondNumber(5);
        Assert.assertEquals(-15, calc.getMultiplicationResult(), 0.1 );

        calc.setFirstNumber(0);
        calc.setSecondNumber(5);
        Assert.assertEquals(0, calc.getMultiplicationResult(), 0.1 );
    }
    @Test
    public void getDivisionResultTest(){
        Ex29SumCalculator calc = new Ex29SumCalculator();

        calc.setFirstNumber(9);
        calc.setSecondNumber(3);
        Assert.assertEquals(3, calc.getDivisionResult(), 0.1 );

        calc.setFirstNumber(-3);
        calc.setSecondNumber(1);
        Assert.assertEquals(-3, calc.getDivisionResult(), 0.1 );

        calc.setFirstNumber(0);
        calc.setSecondNumber(5);
        Assert.assertEquals(0, calc.getDivisionResult(), 0.1 );
    }

}
