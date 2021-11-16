package IPK.matrix;

public class MatrixSnakePattern {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        snakePattern(array);
    }

    private static void snakePattern(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
            } else {
                for (int j = array[i].length-1; j >= 0; j--) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
