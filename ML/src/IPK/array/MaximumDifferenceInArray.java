package IPK.array;

import java.util.Collections;

public class MaximumDifferenceInArray {
    public static void main(String[] args) {
        int[] array = {2, 3, 10, 6, 4, 8, 1};
        int minValue = array[0];
        int result = array[0] - array[1];
        for (int i = 1; i < array.length; i++) {
            result = Math.max(result, array[i] - minValue);
            minValue = Math.min(minValue, array[i]);
        }
        System.out.println(result);
        System.out.println("************   "+ maxDifference(array));
        Collections.sort(Collections.EMPTY_LIST, Collections.reverseOrder());
    }

    private static int maxDifference(int[] array) {
        int max =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                max = Math.max(max, array[j] - array[i]);
            }
        }
        return max;
    }
}
