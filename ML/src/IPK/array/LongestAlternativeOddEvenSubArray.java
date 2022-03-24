package IPK.array;

public class LongestAlternativeOddEvenSubArray {
    public static void main(String[] args) {
        int[] array = {10, 12, 14, 7, 8};
        int count = 1;
        int res = 1;
        for (int i = 1; i < array.length; i++) {
            if ((array[i] % 2 == 0 && array[i - 1] % 2 != 0)
                    || (array[i] % 2 != 0 && array[i - 1] % 2 == 0)) {
                count++;
                res = Math.max(res, count);
            } else {
                count = 1;
            }
        }
        System.out.println(res);
    }
}
