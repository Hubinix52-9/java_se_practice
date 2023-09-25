import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Test;

public class Ex36PoolAreaTest {
    @Test
    @Description("All methods from Rectangle innerclass")
    public void getWidthAndLengthAndAreaTest(){
        Ex36PoolArea obj1 = new Ex36PoolArea();

        Ex36PoolArea.Rectangle rect1 = obj1.new Rectangle(10, 5);
        Assert.assertEquals(5, rect1.getLength(), 0.1);
        Assert.assertEquals(10, rect1.getWidth(), 0.1);
        Assert.assertEquals(50, rect1.getArea(), 0.1);

        Ex36PoolArea.Rectangle rect2 = obj1.new Rectangle(-5, 5);
        Assert.assertEquals(5, rect2.getLength(), 0.1);
        Assert.assertEquals(0, rect2.getWidth(), 0.1);
        Assert.assertEquals(0, rect2.getArea(), 0.1);
    }
    @Test
    @Description("All methods from cuboid innerclass")
    public void getHeightAndVolumeTest(){
        Ex36PoolArea obj1 = new Ex36PoolArea();

        Ex36PoolArea.Cuboid cub1 = obj1.new Cuboid(10, 5, 5);
        Assert.assertEquals(10, cub1.getHeight(), 0.1);
        Assert.assertEquals(250, cub1.getVolume(), 0.1);

        Ex36PoolArea.Cuboid cub2 = obj1.new Cuboid(-5, 5, 1);
        Assert.assertEquals(0, cub2.getHeight(), 0.1);
        Assert.assertEquals(0, cub2.getVolume(), 0.1);
    }
}
