package IPK.dynamic_programming.memoization;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        String string = "forgeeksskeegfor";
        int size = string.length();
        boolean[][] array = new boolean[size][size];
        // for String length 1
        int maxLength = 1;
        for (int i = 0; i < size; i++) {
            array[i][i] = true;
        }

        // for String length 2
        int start = 0;
        for (int i = 0; i < size - 1; i++) {
            if (string.charAt(i) == string.charAt(i + 1)) {
                array[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }


        for (int k = 3; k <= size; k++) {
            // fixing start
            for (int i = 0; i < size - k + 1; i++) {

                int j = i + k - 1;

                if (array[i + 1][j - 1] && string.charAt(i) == string.charAt(j)) {
                    array[i][j] = true;
                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }

        print(string, start, start + maxLength - 1);
    }

    private static void print(String str, int low, int high) {
        System.out.println(str.substring(low, high + 1));
    }
}
