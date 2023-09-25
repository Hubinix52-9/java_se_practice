public class Ex19SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if ((num1 < 10)||(num1>99)||(num2 < 10)||(num2>99)){
            return false;
        }
        String numb1 = ""+num1;
        String numb2 = ""+num2;
        int length1 = numb1.length();
        int length2 = numb2.length();
        for (int i=0; i <= length1-1; i++){
            for (int y=0; y<=length2-1; y++) {
                if (numb1.charAt(i) - '0' == numb2.charAt(y) - '0') {
                    return true;
                }
            }
        }
        return false;
    }
}
