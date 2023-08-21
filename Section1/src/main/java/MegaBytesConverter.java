public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid data");
        } else {
            int megaBytes = kiloBytes / 1024;
            int restkiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + restkiloBytes + " KB");
        }
    }
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2354324);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
}
