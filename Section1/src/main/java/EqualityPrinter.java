public class EqualityPrinter {
    public static void printEqual(int num1, int num2, int num3) {
        if ((num1 < 0)||(num2 <0)||(num3 < 0)) {
            System.out.print("Invalid value");
        }
        else {
            if ((num1 != num2)&&(num1!=num3)&&(num2!=num3)) {
                System.out.print("All numbers are different");
            }
            else if ((num1==num2)&&(num1==num3)) {
                System.out.print("All numbers are equal");
            }
            else {
                System.out.print("Neither all are equal or different");
            }
        }
    }
}
