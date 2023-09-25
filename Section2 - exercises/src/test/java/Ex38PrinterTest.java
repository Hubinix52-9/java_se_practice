import org.junit.Assert;
import org.junit.Test;

public class Ex38PrinterTest {

    @Test
    public void addTonerTest() {
        Ex38Printer printer = new Ex38Printer(50, true);

        Assert.assertEquals(75, printer.addToner(25));
        Assert.assertEquals(100, printer.addToner(25));  // Exceeds maximum toner level
        Assert.assertEquals(-1, printer.addToner(-10));  // Invalid toner amount
    }

    @Test
    public void printPagesTest() {
        Ex38Printer printerSingle = new Ex38Printer(80, false);
        Ex38Printer printerDuplex = new Ex38Printer(50, true);

        Assert.assertEquals(5, printerSingle.printPages(5));
        Assert.assertEquals(3, printerSingle.printPages(3));
        Assert.assertEquals(2, printerDuplex.printPages(4));
        Assert.assertEquals(2, printerDuplex.printPages(3));
    }

    @Test
    public void getPagesPrintedTest() {
        Ex38Printer printer = new Ex38Printer(70, false);

        printer.printPages(10);
        printer.printPages(5);
        printer.printPages(8);

        Assert.assertEquals(23, printer.getPagesPrinted());
    }
}
