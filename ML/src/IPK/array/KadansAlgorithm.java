package IPK.array;

public class KadansAlgorithm {
    public static void main(String[] args) {
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        int max_end = 0;
        int max_far = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            max_end += array[i];
            if (max_end < array[i]) {
                max_end = array[i];
            }
            if (max_far < max_end) {
                max_far = max_end;
            }
        }
        System.out.print(max_far);
    }
}
