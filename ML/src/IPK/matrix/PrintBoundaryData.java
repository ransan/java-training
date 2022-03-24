package IPK.matrix;

public class PrintBoundaryData {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        //  transposeOfMatrix(array);
        rotateMatrixAntiClockWise(array);
        System.out.println("==============================");
        rotateMatrixClockWise(array);
    }

    private static void boundaryMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[0][i] + " ");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][2] + " ");
        }

        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[2][i] + " ");
        }

        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[0][i] + " ");
        }
    }

    private static void transposeOfMatrix(int[][] array) {
        int[][] res = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                res[i][j] = array[j][i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void rotateMatrixAntiClockWise(int[][] array) {
        int[][] temp = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                temp[i][j] = array[j][array.length - i - 1];
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void rotateMatrixClockWise(int[][] array) {
        int[][] temp = new int[array.length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                temp[i][j] = array[array.length - j - 1][i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
