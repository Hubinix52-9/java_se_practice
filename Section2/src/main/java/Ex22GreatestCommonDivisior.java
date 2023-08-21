import java.util.ArrayList;
import java.util.List;

public class Ex22GreatestCommonDivisior {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        List<Integer> firstFactors = new ArrayList<>();
        List<Integer> secFactors = new ArrayList<>();
        for (int i = 1; i <= first; i++) {
            if (first % i == 0) {
                firstFactors.add(i);
            }
        }
        for (int i=1; i<=second; i++){
            if (second % i == 0){
                secFactors.add(i);
            }
        }
        int biggestFactor = 0;
        for (int i=0; i<=firstFactors.size()-1; i++){
            for (int j=0; j<=secFactors.size()-1; j++){
                if (firstFactors.get(i) == secFactors.get(j) && biggestFactor<firstFactors.get(i)){
                    biggestFactor = firstFactors.get(i);
                }
            }
        }
        return biggestFactor;
    }
}
