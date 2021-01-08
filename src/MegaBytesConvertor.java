public class MegaBytesConvertor {
    public static void main(String[] args) {
        MegaBytesConvertor.calculateKilotonMegaBytes(4242424);
    }

    public static void calculateKilotonMegaBytes(int kiloBytes) {

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        }

        //varibles
        int megaBytes;
        int remainingKiloBytes;

        megaBytes = kiloBytes / 1024;
        remainingKiloBytes = kiloBytes % 1024;
        System.out.println(remainingKiloBytes);
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
