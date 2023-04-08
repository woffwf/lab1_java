import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.Printer;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrinterManagerTest {
    @Test
    public void testGetAllPrinters() {
        PrinterManager manager = new PrinterManager();
        manager.addPrinter(new InkjetPrinter());
        manager.addPrinter(new LaserPrinter());
        manager.addPrinter(new ColorLaserPrinter());
        manager.addPrinter(new DotMatrixPrinter("Epson", "LJ", "55.446"));

        List<Printer> allPrinters = manager.getAllPrinters();


    }

    @Test
    public void testGetAllInkjetPrinters() {
        PrinterManager manager = new PrinterManager();
        manager.addPrinter(new InkjetPrinter());
        manager.addPrinter(new LaserPrinter());
        manager.addPrinter(new InkjetPrinter());
        manager.addPrinter(new DotMatrixPrinter("Epson", "LJ", "55.446"));

        List<InkjetPrinter> allInkjetPrinters = manager.getAllInkjetPrinters();


    }

    @Test
    public void testGetAllColorLaserPrinters() {
        PrinterManager manager = new PrinterManager();
        manager.addPrinter(new InkjetPrinter());
        manager.addPrinter(new ColorLaserPrinter());
        manager.addPrinter(new ColorLaserPrinter());
        manager.addPrinter(new DotMatrixPrinter("Epson", "LJ", "55.446"));

        List<ColorLaserPrinter> allColorLaserPrinters = manager.getAllColorLaserPrinters();

        assertEquals(2, allColorLaserPrinters.size());
    }

    @Test
    public void testGetAllDotMatrixPrinter() {
        PrinterManager manager = new PrinterManager();
        manager.addPrinter(new InkjetPrinter());
        manager.addPrinter(new DotMatrixPrinter("Epson", "LJ", "55.446"));
        manager.addPrinter(new DotMatrixPrinter("HP", "LX", "34.989"));
        manager.addPrinter(new LaserPrinter());

        List<DotMatrixPrinter> allDotMatrixPrinters = manager.getAllDotMatrixPrinter();


    }
}
