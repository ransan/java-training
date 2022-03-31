package IPK.array;

import java.util.HashMap;
import java.util.Map;

public class SubSetProblem {
    static Map<Integer, Boolean> map = new HashMap<>();

    public static void main(String[] args) {
        int[] array = {1, 2, 1};
        int target = 3;
        // System.out.println(isSubSet(array, target));
        // System.out.println(isSubSetValue(array, target));
        System.out.println(recrusiveSubset(array, target, array.length));
        //System.out.println(countSubSet(array, target, array.length));
    }

    private static boolean isSubSet(int[] array, int target) {
        if (map.containsKey(target)) return map.get(target);
        if (target == 0) return true;
        if (target < 0) return false;
        for (int num : array) {
            int sub = target - num;
            if (isSubSet(array, sub)) {
                map.put(sub, true);
                return true;
            }
        }
        map.put(target, false);
        return false;
    }

    private static boolean isSubSetValue(int[] array, int target) {
        int n = array.length;
        boolean[][] subset = new boolean[n + 1][target + 1];

        for (int i = 0; i < n + 1; i++) {
            subset[i][0] = true;
        }
        for (int i = 1; i < target; i++) {
            subset[0][i] = false;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (j < array[i - 1]) {
                    subset[i][j] = subset[i - 1][j];
                }
                if (j >= array[i - 1]) {
                    subset[i][j] = subset[i - 1][j] || subset[i - 1][j - array[i - 1]];
                }
            }
        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                System.out.printf("%4d", subset[i][j]);
            }
        }

        return subset[n][target];
    }

    private static boolean recrusiveSubset(int[] array, int target, int n) {
        if (target == 0) return true;
        if (n == 0 && target != 0) return false;

        if (array[n - 1] > target) {
            return recrusiveSubset(array, target, n - 1);
        }
        return recrusiveSubset(array, target, n - 1) || recrusiveSubset(array, target - array[n - 1], n - 1);

    }

    private static int countSubSet(int[] array, int target, int n) {
        if (target == 0) return 1;
        if (n == 0) return 0;
        if (array[n - 1] > target) {
            return countSubSet(array, target, n - 1);
        }
        return countSubSet(array, target, n - 1) + countSubSet(array, target - array[n - 1], n - 1);
    }
}
