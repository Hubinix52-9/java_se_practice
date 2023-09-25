import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Ex37CompositionTest {
    @Test
    @Description("All methods from Lamp innerclass")
    public void LampClassTest(){
        Ex37Composition obj = new Ex37Composition();

        Ex37Composition.Lamp lamp1 = obj.new Lamp("Lamp1", true, 100);
        Assert.assertEquals("Lamp turned on", getOutputOfLamp(lamp1));
        Assert.assertTrue(lamp1.isBattery());
        Assert.assertEquals(100, lamp1.getGlobRating());

        Ex37Composition.Lamp lamp2 = obj.new Lamp("Lamp2", false, 1);
        Assert.assertEquals("Lamp turned on", getOutputOfLamp(lamp2));
        Assert.assertFalse(lamp2.isBattery());
        Assert.assertEquals(1, lamp2.getGlobRating());
    }
    @Test
    public void BedClassTest() {
        Ex37Composition obj = new Ex37Composition();
        Ex37Composition.Bed bed1 = obj.new Bed("Modern", 2, 80, 1, 2);
        Assert.assertEquals("Bed is being made.", getOutputOfBed(bed1));
        Assert.assertEquals("Modern", bed1.getStyle());
        Assert.assertEquals(2, bed1.getPillows());
        Assert.assertEquals(80, bed1.getHeight());
        Assert.assertEquals(1, bed1.getSheets());
        Assert.assertEquals(2, bed1.getQuilt());

        Ex37Composition.Bed bed2 = obj.new Bed("Classic", 4, 70, 2, 3);
        Assert.assertEquals("Bed is being made.", getOutputOfBed(bed2));
        Assert.assertEquals("Classic", bed2.getStyle());
        Assert.assertEquals(4, bed2.getPillows());
        Assert.assertEquals(70, bed2.getHeight());
        Assert.assertEquals(2, bed2.getSheets());
        Assert.assertEquals(3, bed2.getQuilt());
    }

    @Test
    public void CeilingClassTest() {
        Ex37Composition obj = new Ex37Composition();
        Ex37Composition.Ceiling ceiling1 = obj.new Ceiling(120, 1);
        Assert.assertEquals(120, ceiling1.getHeight());
        Assert.assertEquals(1, ceiling1.getPaintedColor());

        Ex37Composition.Ceiling ceiling2 = obj.new Ceiling(150, 2);
        Assert.assertEquals(150, ceiling2.getHeight());
        Assert.assertEquals(2, ceiling2.getPaintedColor());
    }

    @Test
    public void WallClassTest() {
        Ex37Composition obj = new Ex37Composition();
        Ex37Composition.Wall wall1 = obj.new Wall("North");
        Assert.assertEquals("North", wall1.getDirection());

        Ex37Composition.Wall wall2 = obj.new Wall("South");
        Assert.assertEquals("South", wall2.getDirection());
    }

    @Test
    public void BedroomClassTest() {
        Ex37Composition obj = new Ex37Composition();
        Ex37Composition.Wall wall1 = obj.new Wall("North");
        Ex37Composition.Wall wall2 = obj.new Wall("East");
        Ex37Composition.Wall wall3 = obj.new Wall("South");
        Ex37Composition.Wall wall4 = obj.new Wall("West");
        Ex37Composition.Ceiling ceiling = obj.new Ceiling(120, 1);
        Ex37Composition.Bed bed = obj.new Bed("Modern", 2, 80, 1, 2);
        Ex37Composition.Lamp lamp = obj.new Lamp("Vintage", true, 75);

        Ex37Composition.Bedroom bedroom = obj.new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        Assert.assertEquals(lamp, bedroom.getLamp());

        String expectedMakeBedOutput = "Making the bed...\nBed is being made.";
        Assert.assertEquals(expectedMakeBedOutput, getOutputOfBedroom(bedroom));
    }

    public static String getOutputOfLamp(Ex37Composition.Lamp lamp) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        lamp.turnOn();
        return outputStream.toString().trim();
    }
    public static String getOutputOfBed(Ex37Composition.Bed bed) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        bed.make();
        return outputStream.toString().trim();
    }
    public static String getOutputOfBedroom(Ex37Composition.Bedroom bedroom) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        bedroom.makeBed();
        return outputStream.toString().trim();
    }
}
