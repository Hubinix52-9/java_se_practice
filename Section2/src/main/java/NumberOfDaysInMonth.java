public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if ((year <= 0)||(year>=9999)) {
            return false;
        }
        return (year % 4 == 0) || (year % 400 == 0);
    }
    public static int getDaysInMonth(int month, int year){
        if ((month < 1)||(month > 12)||(year < 1)||(year >9999)){
            return -1;
        }
        if (isLeapYear(year)) {
            switch (month) {
                case 1,3,5,7,8,10,12 -> {return 31;}
                case 2 -> {return 29;}
                default -> {return 30;}
            }
        }
        else {
            switch (month) {
                case 1,3,5,7,8,10,12 -> {return 31;}
                case 2 -> {return 28;}
                default -> {return 30;}
            }
        }
    }
}
