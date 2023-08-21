import java.lang.Math;
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
            long mph = Math.round(kilometersPerHour * 0.62137119);
            System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");
        }
    }

    public static void main(String[] args) {
//        long mph = toMilesPerHour(10.25);
//        System.out.println(mph);
        printConversion(-5);
    }
}
