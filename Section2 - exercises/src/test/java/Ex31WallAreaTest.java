import org.junit.Assert;
import org.junit.Test;

public class Ex31WallAreaTest {
    @Test
    public void Ex31WallAreaConstructorTest(){
        Ex31WallArea wa0 = new Ex31WallArea(5,1);
        Assert.assertEquals(5, wa0.getWidth(), 0.1);
        Assert.assertEquals(1, wa0.getHeight(), 0.1);

        Ex31WallArea wa1 = new Ex31WallArea(-5,8);
        Assert.assertEquals(0, wa1.getWidth(), 0.1);
        Assert.assertEquals(8, wa1.getHeight(), 0.1);

        Ex31WallArea wa2 = new Ex31WallArea(13,0);
        Assert.assertEquals(13, wa2.getWidth(), 0.1);
        Assert.assertEquals(0, wa2.getHeight(), 0.1);
    }
    @Test
    public void getAndSetWidthTest(){
        Ex31WallArea wa = new Ex31WallArea();

        wa.setWidth(-5);
        Assert.assertEquals(0, wa.getWidth(), 0.1);
        wa.setWidth(15.6);
        Assert.assertEquals(15.6, wa.getWidth(), 0.1);
        wa.setWidth(1000);
        Assert.assertEquals(1000, wa.getWidth(), 0.1);
    }
    @Test
    public void getAndSetHeightTest(){
        Ex31WallArea wa = new Ex31WallArea();

        wa.setHeight(-56.1);
        Assert.assertEquals(0, wa.getHeight(), 0.1);
        wa.setHeight(17.654);
        Assert.assertEquals(17.6, wa.getHeight(), 0.1);
        wa.setHeight(10001);
        Assert.assertEquals(10001, wa.getHeight(), 0.1);
    }
    @Test
    public void getAreaTest(){
        Ex31WallArea wa = new Ex31WallArea();

        wa.setHeight(5);
        wa.setWidth(10);
        Assert.assertEquals(50, wa.getArea(), 0.1);

        wa.setHeight(-5);
        wa.setWidth(10);
        Assert.assertEquals(0, wa.getArea(), 0.1);

        wa.setHeight(5);
        wa.setWidth(-10);
        Assert.assertEquals(0, wa.getArea(), 0.1);

        wa.setHeight(5.1);
        wa.setWidth(10);
        Assert.assertEquals(51, wa.getArea(), 0.1);
    }
}
