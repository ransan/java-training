package IPK.array;

import java.util.HashMap;
import java.util.Map;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int d = 3;
        int size = array.length;
        rotateArray(size-1, size, array);
        for (int i = 0; i < size; i++) {
            System  .out.print(array[i] + " ");
        }
    }

    private static void rotateArray(int d, int size, int[] array) {
        for (int i = 0; i < d; i++) {
            rotateByOne(array, size);
        }
    }

    private static void rotateByOne(int[] array, int size) {
        int temp;
        int i;
        temp = array[0];
        for (i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = temp;
    }
}
