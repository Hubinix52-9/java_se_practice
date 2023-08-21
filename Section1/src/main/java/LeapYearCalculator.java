public class LeapYearCalculator {
    static public boolean isLeapYear(int year){
        if (year < 1 && year > 9999){
            return false;
        }
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {

        System.out.println(isLeapYear(1700));
        System.out.println(isLeapYear(1800));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2100));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2400));


    }
}
