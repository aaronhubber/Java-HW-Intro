import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(30, 0);
    }

    @Test
    public void hasSheets() {
        assertEquals(30, printer.getSheets());
    }

    @Test
    public void canAddCopies(){
        assertEquals(10, printer.setCopies(10));
    }

    @Test
    public void hasCopies() {
        assertEquals(30, printer.getSheets());
    }


    @Test
    public void printActionReducesSheets(){
        printer.setCopies(10);
        assertEquals(20, printer.printAction());
    }
}
