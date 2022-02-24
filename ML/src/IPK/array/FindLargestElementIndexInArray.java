package IPK.array;

public class FindLargestElementIndexInArray {
    public static void main(String[] args) {
        int[] array = {5, 8, 10, 20, 12, 25, 17};
        System.out.println(getLargest(array));
        System.out.println(largest(array));
    }

    private static int getLargest(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }

    private static int largest(int[] array) {
        int result = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[result]) {
                result = i;
            }
        }
        return result;
    }
}
