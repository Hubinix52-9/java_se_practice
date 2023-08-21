public class Ex17FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){return -1;}
        int sum = 0;
        String num = ""+number;
        int length = num.length();
        for (int i=0; i<= length-1; i++){
            if ((i==0)||(i==length-1)){
                sum += num.charAt(i) - '0';
            }
        }
        return sum;
    }
}
