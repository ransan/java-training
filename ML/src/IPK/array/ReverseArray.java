package IPK.array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {10, 5, 7, 30};
        reverse(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void reverse(int[] array) {
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            int temp = array[high];
            array[high] = array[low];
            array[low] = temp;
            low++;
            high--;
        }
    }
}
