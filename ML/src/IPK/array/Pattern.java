package IPK.array;

import java.util.LinkedList;
import java.util.List;

public class Pattern {
    public static void main(String[] args) {
        // pattern1();
        System.out.println();
        // mergeSort();
        System.out.println();
        // pattern2("12345");
        // pattern3();
        isUpperTriangle();
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
        mergeSort(array, 0, array.length - 1);
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
        for (int i = 0; i < end; i++) {
            System.out.print(str.charAt(start));
            System.out.print(" ");
            System.out.print(str.charAt(end));
        }
    }

    private static void pattern3() {
        int res = 0;
        String str = "12345*+-+";
        List<Integer> digitList = new LinkedList<>();
        List<String> operatorList = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digitList.add(Integer.parseInt(String.valueOf(str.charAt(i))));
            } else {
                operatorList.add(String.valueOf(str.charAt(i)));
            }
        }

        for (int i = 0; i < operatorList.size(); i++) {
            if (i == 0) {
                res = doOperation(res, operatorList.get(i), digitList.get(i), digitList.get(i + 1));
            } else {
                res = doOperation(res, operatorList.get(i), res, digitList.get(i + 1));
            }
        }
        System.out.println(res);
    }

    private static int doOperation(int res, String operator, int integer, int integer1) {
        switch (operator) {
            case "+": {
                res = (integer + integer1);
                break;
            }
            case "-": {
                res = (integer - integer1);
                break;
            }
            case "*": {
                res = (integer * integer1);
                break;
            }
            case "/": {
                res = (integer / integer1);
                break;
            }
            default: {
                return res;
            }
        }
        return res;
    }

    private static void isUpperTriangle() {
        int[][] array = {
                {4, 6, 1, 4},
                {0, 3, 5, 9},
                {0, 0, 6, 2},
                {0, 0, 0, 8}
        };

        boolean upperFlag = true;
        boolean lowerFlag = true;

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i][j] != 0) {
                    upperFlag = false;
                    break;
                }
            }
        }

        if (upperFlag) {
            System.out.println("This is UpperTriangler matrix");
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i][j] != 0) {
                    lowerFlag = false;
                    break;
                }
            }
        }
        if (lowerFlag) {
            System.out.println("This is LowerTriangler matrix");
        }

        System.out.println("its not upper or lower");

    }
}
