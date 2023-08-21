public class Ex43ReverseArray {
    public void reverse(int[] array){
        int size = array.length;
        StringBuilder unchangedArray = new StringBuilder("Array = [");
        for (int i=0; i<=size-1; i++){
            unchangedArray.append(array[i]).append(", ");
        }
        unchangedArray.append("]\n");
        System.out.print(unchangedArray);
        int temp = 0;
        for (int i=0; i<size/2; i++){
            temp = array[i];
            array[i] = array[size-1-i];
            array[size-1-i] = temp;
        }
        StringBuilder changedArray = new StringBuilder("Reversed array = [");
        for (int i=0; i<=size-1; i++){
            changedArray.append(array[i]).append(", ");
        }
        changedArray.append("]\n");

        System.out.print(changedArray);
    }
}
