import java.util.Scanner;

public class Ex41SortedArray {
    public static int[] getIntegers(int size) {
        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }
    public void printArray(int[] array){
        for (int i=0; i<=array.length-1; i++){
            System.out.print("Element "+i+" contests "+array[i]+"\n");
        }
    }
    public int[] sortIntegers(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] < array[j]) {
                    // Swap the elements
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
