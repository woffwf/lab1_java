import org.apache.commons.io.output.ByteArrayOutputStream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

public class ColorLaserPrinterTest {
    private ColorLaserPrinter colorLaserPrinter;

    @Before
    public void setUp() {
        colorLaserPrinter = new ColorLaserPrinter();
    }

    @Test
    public void testPrint() {
        String document = "Test document";
        String expectedOutput = "Printing a color document with a laser printer";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        colorLaserPrinter.print(document);

        Assert.assertEquals(expectedOutput, outputStream.toString().trim());
    }

    @Test
    public void testRefillCartridge() {
        String expectedOutput = "Refilling the toner cartridge for a color laser printer";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        colorLaserPrinter.refillCartridge();

        Assert.assertEquals(expectedOutput, outputStream.toString().trim());
    }

    @Test
    public void testToString() {
        String expectedOutput = "ColorLaserPrinter";
        String actualOutput = colorLaserPrinter.toString();
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testGetRemainingPagesCount() {
        int expectedOutput = 0;
        int actualOutput = colorLaserPrinter.getRemainingPagesCount();
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}
