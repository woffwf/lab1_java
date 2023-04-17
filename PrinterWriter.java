import ua.lviv.iot.algo.part1.Printer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PrinterWriter {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "Brand,Model,Price";

    public void writeToFile(List<Printer> printers) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("printers.csv");


            fileWriter.append(FILE_HEADER.toString());


            fileWriter.append(NEW_LINE_SEPARATOR);


            for (Printer printer : printers) {
                fileWriter.append(printer.getBrand());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(printer.getModel());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append((char) printer.getPrice());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("CSV file was created successfully!");

        } catch (IOException e) {
            System.out.println("Error in FileWriter!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing FileWriter!");
                e.printStackTrace();
            }
        }
    }
}
