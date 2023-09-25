public class Ex26LargestPrime {
    public static int getLargestPrime(int number){
        if (number < 2) {return -1;}
        int biggestPrime = 0;
        if (number == 2) {biggestPrime=2;}
        else if (number == 3) {biggestPrime=3;}
        else {
            for (int i=5; i<=number; i+=2){
                if (isPrime(i) && number%i==0){
                    biggestPrime = i;}
            }
        }
        return biggestPrime;
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
