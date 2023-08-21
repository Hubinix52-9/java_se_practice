import java.util.Scanner;

public class Ex42MinimumElement {
    public int readInteger(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public int [] readElements(int size){
        int [] array = new int[size];
        Scanner scan = new Scanner(System.in);
        for (int i =0; i<= size-1; i++){
            array[i] = scan.nextInt();
        }
        return array;
    }
    public int findMin(int[] array){
        int min = array[0];
        for (int i=1; i<=array.length-1;i++){
            min = (min < array[i]) ? min : array[i];
        }
        return min;
    }
}
