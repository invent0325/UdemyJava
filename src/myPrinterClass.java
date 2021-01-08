public class myPrinterClass {

    private int tonerLevel;
    private int noOfPagesPrinted;
    private char isDuplexPrinterorNot;

    public myPrinterClass(int tonerLevel, int noOfPagesPrinted, char isDuplexPrinterorNot) {
        this.tonerLevel = tonerLevel;
        this.noOfPagesPrinted = noOfPagesPrinted;
        this.isDuplexPrinterorNot = isDuplexPrinterorNot;
    }

    public void tonerUser(int usage) {
        tonerLevel = tonerLevel - usage;

        if(tonerLevel <= 30) {
            System.out.println("warning...toner needs to be refilled, now its " + tonerLevel + "%");
        } else {
            System.out.println("Toner can used for now....");
        }
    }

    public int pagesPrinted(int pages) {
        noOfPagesPrinted = noOfPagesPrinted + pages;
        System.out.println("No of pages printed is now " + noOfPagesPrinted);
        return noOfPagesPrinted;
    }
}
