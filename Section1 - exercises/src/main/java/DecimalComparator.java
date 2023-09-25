public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2) {
        int num1 = (int) (param1 * 1000);
        int num2 = (int) (param2 * 1000);
        return num1 == num2;
    }
}
