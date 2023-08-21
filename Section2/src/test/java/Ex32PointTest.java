import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Test;

public class Ex32PointTest {
    @Test
    @Description("constructor with arguments")
    public void Ex32PointConstructorTest(){
        Ex32Point po0 = new Ex32Point(5,10);
        Assert.assertEquals(5, po0.getX());
        Assert.assertEquals(10, po0.getY());

        Ex32Point po1 = new Ex32Point(-5,10);
        Assert.assertEquals(-5, po1.getX());
        Assert.assertEquals(10, po1.getY());
    }
    @Test
    public void getAndSetX(){
        Ex32Point po = new Ex32Point();

        po.setX(10);
        Assert.assertEquals(10, po.getX());

        po.setX(-5);
        Assert.assertEquals(-5, po.getX());
    }
    @Test
    @Description("distance method with no arguments")
    public void distanceTest1() {
        Ex32Point po0 = new Ex32Point(6, 5);
        Assert.assertEquals(7.810249675906654, po0.distance(), 0.1);
        Ex32Point po1 = new Ex32Point(13, 8);
        Assert.assertEquals(15.264337522473747, po1.distance(), 0.1);
    }
    @Test
    @Description("distance method with x, y arguments")
    public void distanceTest2() {
        Ex32Point po2 = new Ex32Point(6, 5);
        Assert.assertEquals(14.212670403551895, po2.distance(-5, 14), 0.1);
        Ex32Point po3 = new Ex32Point(13, 8);
        Assert.assertEquals(12.806248474865697, po3.distance(3, 0), 0.1);
    }
    @Test
    @Description("distance method with object of Ex32Point class")
    public void distanceTest3(){
        Ex32Point po4 = new Ex32Point(6,5);
        Ex32Point po5 = new Ex32Point(-20,1);
        Assert.assertEquals(26.30589287593181, po4.distance(po5), 0.1);
        Ex32Point po6 = new Ex32Point(1,42);
        Assert.assertEquals(46.06517122512408, po6.distance(po5), 0.1);
    }
}
