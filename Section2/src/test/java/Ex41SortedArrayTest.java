import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Ex41SortedArrayTest {

    private Ex41SortedArray sortedArray;

    @Before
    public void setUp() {
        sortedArray = new Ex41SortedArray();
    }

    @Test
    public void getIntegersTest() {
        int[] expectedArray = {5, 2, 8, 1, 9, 4};
        String input = "5 2 8 1 9 4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        int[] result = sortedArray.getIntegers(6);

        Assert.assertArrayEquals(expectedArray, result);
    }

    @Test
    public void sortIntegersTest() {
        int[] inputArray = {5, 2, 8, 1, 9, 4};
        int[] expectedSortedArray = {9, 8, 5, 4, 2, 1};

        int[] result = sortedArray.sortIntegers(inputArray);

        Assert.assertArrayEquals(expectedSortedArray, result);
    }

    @Test
    public void printArrayTest() {
        int[] array = {3, 1, 4, 1, 5, 9};
        String expectedOutput = "Element 0 contests 3\nElement 1 contests 1\nElement 2 contests 4\n" +
                "Element 3 contests 1\nElement 4 contests 5\nElement 5 contests 9\n";
        String printedOutput = capturePrintOutput(() -> sortedArray.printArray(array));

        Assert.assertEquals(expectedOutput, printedOutput);
    }

   private static String capturePrintOutput(Runnable action) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        action.run();
        System.setOut(originalOut);
        return outputStream.toString();
    }
}