package IPK.array;

public class MergeSortAlgorithm {
    public static void main(String[] args) {
        int[] array = {7, 5, 2, 3, 11, 5};
        int size = array.length;

        sort(array, size, 0, (size - 1));
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    private static void sort(int[] array, int size, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            sort(array, size, left, mid);
            sort(array, size, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = array[mid + j + 1];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }

    }
}
