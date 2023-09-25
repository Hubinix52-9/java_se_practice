import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreaCalculatorTest {
    @Test
    public void areaCircle(){
        Assertions.assertEquals(78.53981633974483, AreaCalculator.area(5));
        Assertions.assertEquals(-1, AreaCalculator.area(-1));
        Assertions.assertEquals(20, AreaCalculator.area(5.0, 4));
        Assertions.assertEquals(-1, AreaCalculator.area(5.0, -1));
    }
}
