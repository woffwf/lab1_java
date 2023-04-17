import ua.lviv.iot.algo.part1.Printer;

import java.io.FileWriter;
import java.io.IOException;
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

    public void writePrintersToCSV(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {

            writer.write("brand,model,price,type\n");
            for (Printer printer : printers) {
                String brand = printer.getBrand();
                String model = String.valueOf(printer.getModel());
                String price = String.valueOf(printer.getPrice());
                String type = "";

                if (printer instanceof InkjetPrinter) {
                    type = "Inkjet";
                } else if (printer instanceof ColorLaserPrinter) {
                    type = "Color Laser";
                } else if (printer instanceof DotMatrixPrinter) {
                    type = "Dot Matrix";
                } else {
                    type = "Unknown";
                }

                writer.write(brand + "," + model + "," + price + "," + type + "\n");
            }

            System.out.println("Printers saved to file " + fileName);
        } catch (IOException e) {
            System.out.println("Failed to write printers to file " + fileName);
            e.printStackTrace();
        }
    }

public static void main(String[] args) {
        PrinterManager manager = new PrinterManager();

        manager.addPrinter(new InkjetPrinter("Epson", "XP-7100", "55.543"));
        manager.addPrinter(new LaserPrinter("HP", "Envy 4520", "55.444"));
        manager.addPrinter(new ColorLaserPrinter("HP", "Pro ", "55.445"));
        manager.addPrinter(new DotMatrixPrinter("Epson", "LJ", "55.446"));

        List<Printer> allPrinters = manager.getAllPrinters();
        PrinterWriter printerWriter = new PrinterWriter();
        printerWriter.writeToFile(allPrinters);

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



    manager.writePrintersToCSV("printers.csv");
}
    }

