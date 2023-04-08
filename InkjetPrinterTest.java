import org.junit.Test;
import static org.junit.Assert.*;

public class InkjetPrinterTest {

    @Test
    public void testGetRemainingPagesCount() {
        InkjetPrinter printer = new InkjetPrinter();
        printer.setPaperCount(100);
        printer.setInkLevel(10);
        int expectedPages = 5*10;



    }
}
