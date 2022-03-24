package IPK.array;

public class MaximumConsecutive1s {
    public static void main(String[] args) {
        int[] array = {1, 0, 1, 1, 1, 0, 0, 1, 1};
        int count = 0;
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
                res = Math.max(count, res);
            } else {
                count = 0;
            }
        }
        System.out.println(res);
    }
}
