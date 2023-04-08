import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.Printer;

import java.util.List;

class MainTest {
    @Test
    void testPrinterManager() {
        PrinterManager manager = new PrinterManager();
        manager.addPrinter(new InkjetPrinter());
        manager.addPrinter(new LaserPrinter());
        manager.addPrinter(new ColorLaserPrinter());
        manager.addPrinter(new DotMatrixPrinter("Epson", "LJ", "55.446"));

        List<Printer> allPrinters = manager.getAllPrinters();
        Assertions.assertEquals(4, allPrinters.size(), "Incorrect number of printers in the list");

        List<InkjetPrinter> allInkjetPrinters = manager.getAllInkjetPrinters();
        Assertions.assertEquals(1, allInkjetPrinters.size(), "Incorrect number of inkjet printers in the list");

        List<ColorLaserPrinter> allColorLaserPrinters = manager.getAllColorLaserPrinters();
        Assertions.assertEquals(1, allColorLaserPrinters.size(), "Incorrect number of color laser printers in the list");

        List<DotMatrixPrinter> allDotMatrixPrinters = manager.getAllDotMatrixPrinter();
        Assertions.assertEquals(1, allDotMatrixPrinters.size(), "Incorrect number of dot matrix printers in the list");
    }
}
