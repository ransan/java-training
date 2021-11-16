package IPK.matrix;

public class SearchElementInSortedMatrix {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        searchElement(array, 5, 5, 17);
    }

    private static void searchElement(int[][] array, int R, int C, int target) {
        int i = 0;
        int j = C - 1;
        while ((i >= 0 && i <= R - 1) && (j >= 0 && j <= C - 1)) {
            if (array[i][j] == target) {
                System.out.println(i + " , " + j);
                return;
            }
            if (array[i][j] > target) {
                j--;
            } else if (array[i][j] < target) {
                i++;
            }
        }
        System.out.println( target + " Not found in Matrix");
    }
}
