package IPK.array;

public class MaximumCircularSubArray {
    public static void main(String[] args) {
        int[] array = {8, -4, 3, -5, 4};
        int size = array.length;
        int normal_sum = kadansAlgorithm(array, size);
        if (normal_sum < 0) {
            System.out.println(normal_sum);
            return;
        }

        int full_sum = 0;
        for (int i = 0; i < size; i++) {
            full_sum += array[i];
            array[i] = (-array[i]);
        }
        int min_sum = kadansAlgorithm(array, size);
        int sum = full_sum + min_sum;
        System.out.println(Math.max(normal_sum, sum));
    }

    private static int kadansAlgorithm(int[] array, int size) {
        int max_end = 0;
        int max_far = 0;
        for (int i = 0; i < size; i++) {
            max_end += array[i];
            if (max_end < array[i]) {
                max_end = array[i];
            }

            if (max_far < max_end) {
                max_far = max_end;
            }
        }
        return max_far;
    }
}
