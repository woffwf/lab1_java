import ua.lviv.iot.algo.part1.Printer;

import java.util.ArrayList;
import java.util.List;

public class PrinterManager {
    private List<Printer> printers = new ArrayList<>();
    public void addPrinter(Printer printer) {
        printers.add(printer);
    }

    public List<Printer> getAllPrinters() {
        return printers;
    }

    public List<InkjetPrinter> getAllInkjetPrinters() {
        List<InkjetPrinter> inkjetPrinters = new ArrayList<>();
        for (Printer printer : printers) {
            if (printer instanceof InkjetPrinter) {
                inkjetPrinters.add((InkjetPrinter) printer);
            }
        }
        return inkjetPrinters;
    }

    public List<ColorLaserPrinter> getAllColorLaserPrinters() {
        List<ColorLaserPrinter> colorLaserPrinters = new ArrayList<>();
        for (Printer printer : printers) {
            if (printer instanceof ColorLaserPrinter) {
                colorLaserPrinters.add((ColorLaserPrinter) printer);
            }
        }
        return colorLaserPrinters;
    }
}
