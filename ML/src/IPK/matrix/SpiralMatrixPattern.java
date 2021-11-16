package IPK.matrix;

public class SpiralMatrixPattern {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        spiralMatrix(array, 5, 5);
    }

    private static void spiralMatrix(int[][] array, int R, int C) {
        int top = 0;
        int right = C - 1;
        int bottom = R - 1;
        int left = 0;
        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                System.out.print(array[top][i] + " ");
            }
            top++;
            System.out.println();

            for (int i = top; i <= bottom; i++) {
                System.out.print(array[i][right] + " ");
            }
            right--;
            System.out.println();

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(array[bottom][i] + " ");
                }
                bottom--;
                System.out.println();
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(array[i][left] + " ");
                }
                left++;
                System.out.println();
            }
        }
    }
}
