package geeksforgeeks.array;

public class SecondLargestElementArray {
    public static void main(String[] args) {
        int[] array = {10, 7, 12, 8, 2};
        int left = 0;
        int right = array.length - 1;
        sort(array, left, right);
        System.out.println(array[array.length-2]);
    }

    private static void sort(int[] array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            sort(array, left, middle);
            sort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[i + left];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[middle + j + 1];
        }
        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
