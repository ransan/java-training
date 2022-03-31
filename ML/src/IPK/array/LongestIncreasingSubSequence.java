package IPK.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubSequence {
    public static void main(String[] args) {
        int[] array = {50,3, 10,7,40,80};
        LIS_I(array);

    }

    private static void LIS(int[] array) {
        int[] lsm = new int[array.length];
        Arrays.fill(lsm, 1);

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] > array[j] && lsm[i] <= lsm[j]) {
                    lsm[i] = 1 + lsm[j];
                }
            }
        }
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);
    }

    private static void LIS_I(int[] array) {
        List<List<Integer>> LIS = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            LIS.add(new ArrayList<>());
        }

        LIS.get(0).add(array[0]);
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) { // {50,3, 10,7,40,80};
                if (array[i] > array[j] && LIS.get(j).size() > LIS.get(i).size()) {
                    LIS.set(i, new ArrayList<>(LIS.get(j)));
                }
            }
            LIS.get(i).add(array[i]);
        }

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (LIS.get(j).size() < LIS.get(i).size()) {
                j = i;
            }
        }
        System.out.println(LIS);
    }
}
