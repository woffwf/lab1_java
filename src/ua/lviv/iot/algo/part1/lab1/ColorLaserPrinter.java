import ua.lviv.iot.algo.part1.Printer;

public class ColorLaserPrinter extends Printer {
    private int colorCartridgeLevel;
    private int blackCartridgeLevel;
    public ColorLaserPrinter(String model, String manufacturer, String s) {
        super();
    }
    public void print(String document) {
        System.out.println("Printing a color document with a laser printer");
    }
    public void refillCartridge() {
        System.out.println("Refilling the toner cartridge for a color laser printer");
    }



    public String toString() {
        return "ColorLaserPrinter";
    }
    public int getRemainingPagesCount() {
        return 0;
    }
}

