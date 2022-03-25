package IPK.array;


/* Java program for Merge Sort */
class MergeSort {

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {7, 5, 2, 3, 11, 5};

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1, "DESC");

        System.out.println("\nSorted array");
        printArray(arr);
    }

    private void sort(int[] arr, int l, int r, String order) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m, order);
            sort(arr, m + 1, r, order);
            merge(arr, l, m, r, order);
        }
    }

    private void merge(int[] arr, int l, int m, int r, String order) {

        int left = m - l + 1;
        int right = r - m;

        int[] L = new int[left];
        int[] R = new int[right];

        for (int i = 0; i < left; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < right; j++) {
            R[j] = arr[m + j + 1];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while (i < left && j < right) {
            if (order == "ASC") {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
            } else {
                if (L[i] >= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
            }
            k++;
        }

        while (i < left) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < right) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
