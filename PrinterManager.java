import ua.lviv.iot.algo.part1.Printer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrinterManager {
    private List<Printer> printers = new ArrayList<>();

    public void addPrinter(Printer printer) {

        printers.add(printer);
    }

    public List<Printer> getAllPrinters() {

        return printers;
    }

    public List<InkjetPrinter> getAllInkjetPrinters() {
        return printers.stream()
                .filter(printer -> printer instanceof InkjetPrinter)
                .map(printer -> (InkjetPrinter) printer)
                .collect(Collectors.toList());
    }

    public List<ColorLaserPrinter> getAllColorLaserPrinters() {
        return printers.stream()
                .filter(printer -> printer instanceof ColorLaserPrinter)
                .map(printer -> (ColorLaserPrinter) printer)
                .collect(Collectors.toList());
    }

    public List<DotMatrixPrinter> getAllDotMatrixPrinter() {
        return printers.stream()
                .filter(printer -> printer instanceof DotMatrixPrinter)
                .map(printer -> (DotMatrixPrinter) printer)
                .collect(Collectors.toList());
    }
}

