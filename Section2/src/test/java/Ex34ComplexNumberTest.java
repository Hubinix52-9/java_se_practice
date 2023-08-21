import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Test;

public class Ex34ComplexNumberTest {
    @Test
    public void getRealAndImaginaryTest(){
        Ex34ComplexNumber compNumb = new Ex34ComplexNumber(5,10);
        Assert.assertEquals(5, compNumb.getReal(),0.1);
        Assert.assertEquals(10, compNumb.getImaginary(),0.1);

        Ex34ComplexNumber compNumb1 = new Ex34ComplexNumber(-5,15);
        Assert.assertEquals(-5, compNumb1.getReal(),0.1);
        Assert.assertEquals(15, compNumb1.getImaginary(),0.1);
    }
    @Test
    @Description("add with 2 parameters - real, imaginary")
    public void addTest1(){
        Ex34ComplexNumber compNumb = new Ex34ComplexNumber(5,10);
        compNumb.add(5,10);
        Assert.assertEquals(10, compNumb.getReal(),0.1);
        Assert.assertEquals(20, compNumb.getImaginary(),0.1);

        Ex34ComplexNumber compNumb1 = new Ex34ComplexNumber(-5,15);
        compNumb1.add(-5, -5);
        Assert.assertEquals(-10, compNumb1.getReal(),0.1);
        Assert.assertEquals(10, compNumb1.getImaginary(),0.1);
    }
    @Test
    @Description("add with 1 parameter - object of Ex34ComplexNumber class")
    public void addTest2(){
        Ex34ComplexNumber compNumb = new Ex34ComplexNumber(5,10);
        Ex34ComplexNumber compNumb1 = new Ex34ComplexNumber(15, 10);
        compNumb.add(compNumb1);
        Assert.assertEquals(20, compNumb.getReal(),0.1);
        Assert.assertEquals(20, compNumb.getImaginary(),0.1);

        Ex34ComplexNumber compNumb2 = new Ex34ComplexNumber(-5,15);
        Ex34ComplexNumber compNumb3 = new Ex34ComplexNumber(32,-118);
        compNumb2.add(compNumb3);
        Assert.assertEquals(27, compNumb2.getReal(),0.1);
        Assert.assertEquals(-103, compNumb2.getImaginary(),0.1);
    }
}
