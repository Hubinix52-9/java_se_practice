public class Ex16NumberPalindrome {
    public static boolean isPalindrome(int number) {
        String num = ""+number;
        char chara = ' ';
        char charb = ' ';
        int length = num.length();
            for (int i=0; i<length/2;i++) {
                chara = num.charAt(i);
                charb = num.charAt(length - 1 - i);
                if (chara != charb) {
                    return false;
                }
            }
            return true;
        }
    }
