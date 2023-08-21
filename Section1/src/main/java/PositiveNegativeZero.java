public class PositiveNegativeZero {

    public static void positive_zero_negative(int number) {
        String info = "";
        if (number < 0) {
            info = "Negative";
        } else if (number > 0) {
            info = "Positive";
        } else {
            info = "Equal";
        }
        System.out.println(info);
    }
}



