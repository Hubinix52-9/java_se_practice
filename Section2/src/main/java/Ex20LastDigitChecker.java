public class Ex20LastDigitChecker {
    public static boolean hasSameLastDigit(int numb1, int numb2, int numb3) {
        if (isValid(numb1) && isValid(numb2) && isValid(numb3)) {
            String num1 = "" + numb1;
            String num2 = "" + numb2;
            String num3 = "" + numb3;
            int length1 = num1.length() - 1;
            int length2 = num2.length() - 1;
            int length3 = num3.length() - 1;
            boolean firstExp = num1.charAt(length1) == num2.charAt(length2);
            boolean seccExp = num2.charAt(length2) == num3.charAt(length3);
            boolean thirdExp = num1.charAt(length1) == num3.charAt(length3);
            return firstExp || seccExp || thirdExp;
        } else {
            return false;
        }
    }

    public static boolean isValid(int number) {
        return ((number >= 10) && (number <= 1000));
    }
}