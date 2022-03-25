package IPK.array;

public class Pattern {
    public static void main(String[] args) {
        pattern1();
        System.out.println();
        mergeSort();
        System.out.println();
        pattern2("12345");
    }

    private static void pattern1() {
        String str = "a1b10c15";
        int n = str.length();
        String[] arr = str.split("[a-zA-Z]");
        int count = 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                for (int j = 0; j < Integer.parseInt(arr[count]); j++) {
                    builder.append(str.charAt(i));
                }
                count++;
            }
        }
        System.out.println(builder.toString());
    }

    private static void mergeSort() {
        int[] array = {7, 5, 2, 3, 11, 5};
        mergeSort(array, 0, array.length-1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void mergeSort(int[] array, int l, int r) {
        if (l < r) {
            int middle = l + (r - l) / 2;
            mergeSort(array, l, middle);
            mergeSort(array, (middle + 1), r);
            mergeHalves(array, l, middle, r);
        }
    }

    private static void mergeHalves(int[] array, int l, int middle, int r) {
        int n1 = middle - l + 1;
        int n2 = r - middle;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = array[l + i];
        }

        for (int i = 0; i < n2; ++i) {
            R[i] = array[middle + 1 + i];
        }


        int i = 0;
        int j = 0;
        int k = l;

        while (l < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                l++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (l < n1) {
            array[k] = L[i];
            l++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }

    }

    private static void pattern2(String str) {
        int start = 0;
        int end = str.length();
        for (int i=0; i<end; i++) {
            System.out.print(str.charAt(start));
            System.out.print(" ");
            System.out.print(str.charAt(end));
        }
    }
}
