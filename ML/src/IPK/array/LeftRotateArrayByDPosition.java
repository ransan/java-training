package IPK.array;

public class LeftRotateArrayByDPosition {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;
        int d = 3;
        reverse(array, 0, d-1);
       // reverse(array, d, n - 1);
       //  reverse(array, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void reverse(int[] array, int low, int high) {
        while (low < high) {
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;
        }
    }
}
