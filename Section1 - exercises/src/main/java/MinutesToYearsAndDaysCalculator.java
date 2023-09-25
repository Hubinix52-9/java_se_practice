public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.print("Invalid value");
        }
        else {
            long tempDays = minutes / 1440;
            int Years = (int) (tempDays / 365);
            int Days = (int) (tempDays % 365);
            System.out.print(minutes + " min = " + Years + " y " + "and " + Days + " d");
        }
    }
}
