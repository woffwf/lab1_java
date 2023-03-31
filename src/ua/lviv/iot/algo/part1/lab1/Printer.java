package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor

public class Printer {
    private String model= "Pixma";
    private String type= "laser";
    private boolean isColor= true;
    private boolean isDuplex= false;
    private int paperTrayCapacity= 123;
    private int paperCount= 1;
    private static Printer defaultPrinter = new Printer();
    private static Printer instance= new Printer();

    public void print(int pages) {
        if (pages > paperCount) {
            System.out.println("Not enough paper in tray.");
        } else {
            paperCount -= pages;
            System.out.println(pages + " pages printed.");
        }
    }
    public static Printer getInstance() {
        return instance;
    }
   
    public void loadPaper(int count) {
        paperCount += count;
        if (paperCount > paperTrayCapacity) {
            paperCount = paperTrayCapacity;
        }
        System.out.println(count + " pages loaded into tray.");
    }
    public static void main(String[] args) {
        Printer[] printers = new Printer[4];
        printers[0] = new Printer("Pixma", "laser", false,false, 88, 5);
        printers[1] = new Printer();
        printers[2] = getInstance();
        printers[3] = getInstance();

        for (int i = 0; i < printers.length; i++) {
            System.out.println("Printer " + (i + 1) + " Number: " + printers[i].toString());
        }
    }
}
