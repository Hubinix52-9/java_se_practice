public class Ex18EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if (number <0){return -1;}
        String num = ""+number;
        int length = num.length();
        int sum = 0;
        for (int i=0; i<=length-1; i++){
            if (i%2==1){
                sum += num.charAt(i) - '0';
            }
        }
        return sum;
    }
}
