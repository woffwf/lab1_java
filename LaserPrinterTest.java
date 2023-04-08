import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LaserPrinterTest {
    private LaserPrinter laserPrinter;

    @BeforeEach
    void setUp() {
        laserPrinter = new LaserPrinter();
    }

    @Test
    void testGetRemainingPagesCount() {
        laserPrinter.loadPaper(100);
        laserPrinter.print(500);
        int remainingPagesCount = laserPrinter.getRemainingPagesCount();
        System.out.println("Remaining pages count: " + remainingPagesCount);
    }

    @Test
    void testPrintNotEnoughToner() {
        laserPrinter.loadPaper(10);
        laserPrinter.print(50);
    }

    @Test
    void testPrintNotEnoughPaper() {
        laserPrinter.loadPaper(5);
        laserPrinter.print(100);
    }
}

