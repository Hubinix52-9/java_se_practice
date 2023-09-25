public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        long mph = Math.round(kilometersPerHour * 0.62137119);
        return mph;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0){
            System.out.println("Invald value");
        }
        else {
            long mph = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");
        }
    }

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
}
