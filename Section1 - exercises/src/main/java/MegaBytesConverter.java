public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.print("Invalid data");
        } else {
            int megaBytes = kiloBytes / 1024;
            int restkiloBytes = kiloBytes % 1024;
            System.out.print(kiloBytes + " KB = " + megaBytes + " MB and " + restkiloBytes + " KB");
        }
    }
}
