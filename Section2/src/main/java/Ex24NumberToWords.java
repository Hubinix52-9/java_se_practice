public class Ex24NumberToWords {
    public static void numberToWords(int number){
        if (number < 0) {
            System.out.print("Invalid value");
        }
        else {
            int reversedNumb = reverse(number);
            StringBuilder numbToWords = new StringBuilder();
            for (int i=1; i<=getDigitCount(number); i++){
                switch(reversedNumb%(10)){
                    case 0 -> {
                        numbToWords.append("ZERO ");}
                    case 1 -> {
                        numbToWords.append("ONE ");}
                    case 2 -> {
                        numbToWords.append("TWO ");}
                    case 3 -> {
                        numbToWords.append("THREE ");}
                    case 4 -> {
                        numbToWords.append("FOUR ");}
                    case 5 -> {
                        numbToWords.append("FIVE ");}
                    case 6 -> {
                        numbToWords.append("SIX ");}
                    case 7 -> {
                        numbToWords.append("SEVEN ");}
                    case 8 -> {
                        numbToWords.append("EIGHT ");}
                    case 9 -> {
                        numbToWords.append("NINE ");}
                }
                reversedNumb = (reversedNumb - reversedNumb%(10))/10;
            }
            System.out.print(numbToWords);
        }
    }
    public static int reverse(int number){
        boolean negative = number < 0;

        if (negative) {
            StringBuilder reversedNumbStr = new StringBuilder(""+(number*-1));
            return (Integer.parseInt((reversedNumbStr.reverse()).toString())*-1) ;
        }
        else {
            StringBuilder reversedNumbStr = new StringBuilder(""+(number));
            return (Integer.parseInt((reversedNumbStr.reverse()).toString())) ;
        }
    }
    public static int getDigitCount(int number){
        if (number < 0 ) {return -1;}
        int length = ("" + number).length();
        return length;
    }
}
