import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import java.io.ByteArrayInputStream;

public class Ex42MinimumElementTest {
    private Ex42MinimumElement findMin;
    @Before
    public void setUp() {
        findMin = new Ex42MinimumElement();
    }

    @Test
    public void readIntegerTest(){
        String inValues = "6";
        System.setIn(new ByteArrayInputStream(inValues.getBytes()));
        Assert.assertEquals(6,findMin.readInteger());
    }

    @Test
    public void readElementsTest(){
        int[] expectedOutput = {6, 4, 13, 54, -5, 1};
        System.setIn(new ByteArrayInputStream("6".getBytes()));
        int size = findMin.readInteger();
        String inValues = "6 4 13 54 -5 1\n";
        System.setIn(new ByteArrayInputStream(inValues.getBytes()));
        System.out.flush();
        int[] result = findMin.readElements(size);
        Assert.assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void findMinTest(){
        System.setIn(new ByteArrayInputStream("6".getBytes()));
        int size = findMin.readInteger();

        System.setIn(new ByteArrayInputStream("-45 -4 3 2 6 1".getBytes()));
        int[] array = findMin.readElements(size);

        Assert.assertEquals(-45, findMin.findMin(array));
    }



}
