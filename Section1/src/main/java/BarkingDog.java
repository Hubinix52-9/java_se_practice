public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 8 && hourOfDay >0 && barking) {
            return true;
        }
        else if (hourOfDay >= 22 && hourOfDay <= 23 && barking) {
            return true;
        }
        else {
        return false;
        }
    }
    public static void main(String[] args) {

       System.out.println(shouldWakeUp(true, 22));
        System.out.println(shouldWakeUp(true, 14));
        System.out.println(shouldWakeUp(false, 22));
        System.out.println(shouldWakeUp(true, 2));

    }
}
