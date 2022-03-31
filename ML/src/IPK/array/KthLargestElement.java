package IPK.array;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] array = {7, 10, 4, 3, 20, 15};
        int size = array.length;
        int k = 4;
        sort(array, 0, size - 1, size);
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println(array[k - 1]);

    }

    private static void sort(int[] array, int l, int r, int size) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(array, l, m, size);
            sort(array, m + 1, r, size);
            merge(array, l, m, r);
        }
    }

    private static void merge(int[] array, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = array[l + i];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = array[m + i + 1];
        }

        int i = 0, j = 0;
        int k = l;

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

        while (i < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}
