import org.junit.Assert;
import org.junit.Test;

public class Ex28PaintJobTest {
    @Test
    public void getBucketCount(){
        Assert.assertEquals(-1, Ex28PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
        Assert.assertEquals(3, Ex28PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
        Assert.assertEquals(3, Ex28PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));

        Assert.assertEquals(-1, Ex28PaintJob.getBucketCount(-3.4, 2.1, 1.5));
        Assert.assertEquals(5, Ex28PaintJob.getBucketCount(3.4, 2.1, 1.5));
        Assert.assertEquals(14, Ex28PaintJob.getBucketCount(7.25, 4.3, 2.35));

        Assert.assertEquals(3, Ex28PaintJob.getBucketCount(3.4, 1.5));
        Assert.assertEquals(3, Ex28PaintJob.getBucketCount(6.26, 2.2));
        Assert.assertEquals(5, Ex28PaintJob.getBucketCount(3.26, 0.75));
        Assert.assertEquals(-1, Ex28PaintJob.getBucketCount(-7.25, 4.3));
    }
}
