Create a Printer class that will have the following fields:
model: printer model;
type: type of printer (ink or laser);
isColor: whether the printer is color (true - if so, false - if not);
isDuplex: whether the printer has the possibility of double-sided printing (true - if so, false - if not);
paperTrayCapacity: the maximum number of sheets in the paper tray;
paperCount: The current number of sheets of paper in the tray.

The Printer class has the following public methods:
print(int pages): method that prints the specified number of pages (assumes subtraction from all sheets in the tray);
loadPaper(int count): a method that adds the number of sheets of paper to the tray and checks for overfilling the tray, if the number of sheets after adding is greater than paperTrayCapacity, then paperCount has a uniform maximum number of sheets.
