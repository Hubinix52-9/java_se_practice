import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Test;

public class Ex35CylinderTest {
    @Test
    @Description("All methods from circle innerclass")
    public void getRadiusAndAreaTest(){
        Ex35Cylinder obj1 = new Ex35Cylinder();

        Ex35Cylinder.Circle circ1 = obj1.new Circle(5);
        Assert.assertEquals(5, circ1.getRadius(), 0.1);
        Assert.assertEquals(78.53981633974483, circ1.getArea(), 0.1);

        Ex35Cylinder.Circle circ2 = obj1.new Circle(-5);
        Assert.assertEquals(0, circ2.getRadius(), 0.1);
        Assert.assertEquals(0, circ2.getArea(), 0.1);

        Ex35Cylinder.Circle circ3 = obj1.new Circle(3);
        Assert.assertEquals(3, circ3.getRadius(), 0.1);
        Assert.assertEquals(28.274333882308138, circ3.getArea(), 0.1);
    }

    @Test
    @Description("Method from cylinder innerclass")
    public void getHeightTest(){
        Ex35Cylinder obj1 = new Ex35Cylinder();

        Ex35Cylinder.Cylinder cyl1 = obj1.new Cylinder(5, 10);
        Assert.assertEquals(10, cyl1.getHeight(), 0.1);

        Ex35Cylinder.Cylinder cyl2 = obj1.new Cylinder(-5, 15);
        Assert.assertEquals(15, cyl2.getHeight(), 0.1);

        Ex35Cylinder.Cylinder cyl3 = obj1.new Cylinder(3, 1);
        Assert.assertEquals(1, cyl3.getHeight(), 0.1);
    }
    @Test
    @Description("Method from cylinder innerclass")
    public void getVolumeTest(){
        Ex35Cylinder obj1 = new Ex35Cylinder();

        Ex35Cylinder.Cylinder cyl1 = obj1.new Cylinder(5, 10);
        Assert.assertEquals(785.3981633974483, cyl1.getVolume(), 0.1);

        Ex35Cylinder.Cylinder cyl2 = obj1.new Cylinder(-5, 15);
        Assert.assertEquals(0, cyl2.getVolume(), 0.1);

        Ex35Cylinder.Cylinder cyl3 = obj1.new Cylinder(3, 1);
        Assert.assertEquals(28.274333882308138, cyl3.getVolume(), 0.1);
    }
}
