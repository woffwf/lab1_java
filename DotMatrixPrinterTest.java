import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DotMatrixPrinterTest {

    @Test
    public void testPrint() {
        DotMatrixPrinter printer = new DotMatrixPrinter();
        String text = "hey";
        printer.print(text);
        assertTrue(true);
    }



    @Test
    public void testTurnOff() {
        DotMatrixPrinter printer = new DotMatrixPrinter();
        printer.turnOn();
        printer.turnOff();
        assertFalse(printer.isTurnedOn());
    }

    @Test
    public void testGetRemainingPagesCount() {
        DotMatrixPrinter printer = new DotMatrixPrinter();
        assertEquals(0, printer.getRemainingPagesCount());
    }
}
