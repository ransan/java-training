package IPK.matrix;

public class RotateMatrixAntiClockWise90Degree {
    public static void main(String[] args) {
        final int R = 5;
        final int C = 5;
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        rotate(array, R, C);
    }

    private static void rotate(int[][] array, int R, int C) {
        int[][] temp = new int[C][R];
        for (int i = 0; i < C; i++) {
            for (int j = 0; j < R; j++) {
                temp[R - j - 1][i] = array[i][j];
            }
        }

        for (int i = 0; i < C; i++) {
            for (int j = 0; j < R; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
