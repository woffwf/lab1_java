import lombok.ToString;
import ua.lviv.iot.algo.part1.Printer;

@ToString(callSuper = true)
class LaserPrinter extends Printer {
    private int tonerLevel = 56;
    private int printedPages = 0;
    private static final int MAX_PRINTED_PAGES_PER_TONER = 560;


    public LaserPrinter(String hp, String s, String s1) {
        super();

    }public int getRemainingPagesCount() {
        return Math.min(paperCount, (tonerLevel * MAX_PRINTED_PAGES_PER_TONER) - printedPages);

    }public void print(int pages) {
        if (pages > getRemainingPagesCount()) {
            System.out.println("Not enough toner or paper.");
        } else {
            paperCount -= pages;
            tonerLevel -= (pages / MAX_PRINTED_PAGES_PER_TONER);
            printedPages += pages;
            System.out.println(pages + " pages printed.");
        }
    }
}