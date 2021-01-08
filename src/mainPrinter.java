public class mainPrinter {

    public static void main(String[] args) {

        myPrinterClass p = new myPrinterClass(100, 50, 'Y');
        p.tonerUser(50);
        p.pagesPrinted(200);
        p.tonerUser(30);
        p.pagesPrinted(400);
    }
}
