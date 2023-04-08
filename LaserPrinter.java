import lombok.ToString;
import ua.lviv.iot.algo.part1.Printer;

@ToString(callSuper = true)
class LaserPrinter extends Printer {
    public static final int MAX_PRINTED_PAGES_PER_TONER = 560 ;
    private int tonerLevel = 56;
    private int printedPages = 0;



    public LaserPrinter() {
        super();

    }

    public int getRemainingPagesCount() {
        return Math.min(paperCount, (tonerLevel * MAX_PRINTED_PAGES_PER_TONER) - printedPages);

    }

    public void print(int pages) {
        if (pages > getRemainingPagesCount()) {
            System.out.println("Not enough toner or paper.");
        } else {
            paperCount -= pages;
            tonerLevel -= (pages / MAX_PRINTED_PAGES_PER_TONER);
            printedPages += pages;
            System.out.println(pages + " pages printed.");
        }
    }   public void loadPaper(int i) {
    }

    public int getPaperCount() {
        return 0;
    }

    public int getTonerLevel() {
        return 0;
    }
}


