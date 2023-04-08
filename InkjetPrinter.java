import lombok.ToString;
import ua.lviv.iot.algo.part1.Printer;

class InkjetPrinter extends Printer {
    private String inkType = "CMYK";
    private int inkLevel = 100;
    private static final int REQUIRED_COLOUR_PER_PAGE = 10;

    public InkjetPrinter() {
        super();
    }

    public int getRemainingPagesCount() {
        return Math.min(paperCount, inkLevel * REQUIRED_COLOUR_PER_PAGE);
    }

    public void setPaperCount(int i) {
    }

    public void setInkLevel(int i) {
    }
}


