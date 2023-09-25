public class Ex25FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal > (bigCount*5)+smallCount || goal%5>smallCount) { return false;}
        int sum = 0;
        int i = 0;
        while (sum < goal ){
            if (sum+5<goal && bigCount>0){
                sum += 5;
                bigCount -= 1;
            }
            else {
                if (sum + 1 <= goal && smallCount > 0) {
                    sum+=1;
                    smallCount -=1;
                }
            }
            if (smallCount == 0 && bigCount ==0){ return false;}
        }
        return true;
    }
}
