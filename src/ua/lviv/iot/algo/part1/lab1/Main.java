import ua.lviv.iot.algo.part1.Printer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrinterManager manager = new PrinterManager();

        manager.addPrinter(new InkjetPrinter("Epson", "XP-7100", "55.543"));
        manager.addPrinter(new LaserPrinter("HP", "Envy 4520", "55.444"));
        manager.addPrinter(new ColorLaserPrinter("HP", "Pro ", "55.445"));
        manager.addPrinter(new DotMatrixPrinter("Epson", "LJ", "55.446"));


        List<Printer> allPrinters = manager.getAllPrinters();
        System.out.println("All printers:");
        for (Printer printer : allPrinters) {
            System.out.println(printer);
        }
        List<ColorLaserPrinter> allColorLaserPrinters = manager.getAllColorLaserPrinters();
        System.out.println("All color laser printers:");
        for (ColorLaserPrinter printer : allColorLaserPrinters) {
            System.out.println(printer);
        }
        List<InkjetPrinter> allInkjetPrinters = manager.getAllInkjetPrinters();
        System.out.println("All inkjet printers:");
        for (InkjetPrinter printer : allInkjetPrinters) {
            System.out.println(printer);
        }

    }
}
