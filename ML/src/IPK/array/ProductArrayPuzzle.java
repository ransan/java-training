package IPK.array;

import java.util.Arrays;

/**
 * I/P: [1,2,3,4]
 * O/P: [24,12,8,1,26]
 */
public class ProductArrayPuzzle {
    public static void main(String[] args) {
        int[] array = {1, 0};
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};

        int sum = Arrays.stream(array1).boxed().mapToInt(e -> e).reduce(0, Math::addExact);
        System.out.println("**** " + sum);

        productArrayMethod1(array1, array1.length);
        System.out.print("=========================");
        productArrayMethod2(array2, array2.length);
    }

    private static void productArrayMethod1(int[] array, int size) {
        int[] left = new int[size];
        left[0] = 1;
        int[] right = new int[size];
        right[size - 1] = 1;
        for (int i = 1; i < array.length; i++) {
            left[i] = left[i - 1] * array[i - 1];
        }

        for (int i = array.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * array[i + 1];
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = left[i] * right[i];
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void productArrayMethod2(int[] array, int size) {
        long[] res = new long[size];
        long product = Arrays.stream(array).boxed().mapToLong(e -> e).reduce(1l, Math::multiplyExact);


        for (int i = 0; i < size; i++) {
            res[i] = product / array[i];
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
