import org.junit.Assert;
import org.junit.Test;

public class Ex25FlourPackProblemTest {
    @Test
    public void canPackTest(){
        Assert.assertTrue(Ex25FlourPackProblem.canPack(0,17,5));
        Assert.assertTrue(Ex25FlourPackProblem.canPack(2,2,11));
        Assert.assertFalse(Ex25FlourPackProblem.canPack(2,0,6));
        Assert.assertFalse(Ex25FlourPackProblem.canPack(2,-5,6));
    }

}
