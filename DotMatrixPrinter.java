import java.awt.Point;
import lombok.*;
import ua.lviv.iot.algo.part1.Printer;


public class DotMatrixPrinter extends Printer {

    private int dotsPerInch;
    private int paperSize;
    public DotMatrixPrinter(String epson, String manufacturer, String s) {

        super();
    }

    public DotMatrixPrinter() {

    }

    public void print(String text) {
        System.out.println("Printing '" + text + "' on a dot-matrix printer.");
    }

    public void turnOn() {
        System.out.println("Turning on  dot-matrix printer...");
        super.turnOn();
    }
    public void turnOff() {
        System.out.println("Turning off dot-matrix printer...");
        super.turnOff();
    }
    public int getRemainingPagesCount() {
        return 0;
    }

    public boolean isTurnedOn() {
        return false;
    }
}

