import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Test;

public class Ex33CarpetCostCalculatorTest {
    @Test
    @Description("This test covers constructor and get method for Carpet innerclass")
    public void CarpetClassTest(){
        Ex33CarpetCostCalculator obj1 = new Ex33CarpetCostCalculator();

        Ex33CarpetCostCalculator.Carpet carpet1 = obj1.new Carpet(25);
        Assert.assertEquals(25, carpet1.getCost(),0.1);

        Ex33CarpetCostCalculator.Carpet carpet2 = obj1.new Carpet(-5);
        Assert.assertEquals(0, carpet2.getCost(),0.1);
    }
    @Test
    @Description("This test covers constructor and get method for Floor innerclass")
    public void FloorClassTest(){
        Ex33CarpetCostCalculator obj1 = new Ex33CarpetCostCalculator();

        Ex33CarpetCostCalculator.Floor floor1 = obj1.new Floor(20, 20);
        Assert.assertEquals(400, floor1.getArea(),0.1);

        Ex33CarpetCostCalculator.Floor floor2 = obj1.new Floor(0, 20);
        Assert.assertEquals(0, floor2.getArea(),0.1);

        Ex33CarpetCostCalculator.Floor floor3 = obj1.new Floor(0, 0);
        Assert.assertEquals(0, floor3.getArea(),0.1);
    }
    @Test
    @Description("This test covers constructor and get method for Calculator innerclass")
    public void CalculatorClassTest(){

        Ex33CarpetCostCalculator obj1 = new Ex33CarpetCostCalculator();

        Ex33CarpetCostCalculator.Carpet carpet1 = obj1.new Carpet(25);
        Ex33CarpetCostCalculator.Floor floor1 = obj1.new Floor(20, 20);
        Ex33CarpetCostCalculator.Calculator calc1 = obj1.new Calculator(floor1, carpet1);
        Assert.assertEquals(10000, calc1.getTotalCost(),0.1);

        Ex33CarpetCostCalculator.Carpet carpet2 = obj1.new Carpet(-5);
        Ex33CarpetCostCalculator.Floor floor2 = obj1.new Floor(20, 20);
        Ex33CarpetCostCalculator.Calculator calc2 = obj1.new Calculator(floor2, carpet2);
        Assert.assertEquals(0, calc2.getTotalCost(),0.1);

        Ex33CarpetCostCalculator.Carpet carpet3 = obj1.new Carpet(10);
        Ex33CarpetCostCalculator.Floor floor3 = obj1.new Floor(10, 10);
        Ex33CarpetCostCalculator.Calculator calc3 = obj1.new Calculator(floor3, carpet3);
        Assert.assertEquals(1000, calc3.getTotalCost(),0.1);
    }
}
