package IPK.matrix;

public class PrintBoundaryElements {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        boundaryElements(array);
    }

    private static void boundaryElements(int[][] array) {
        if (array.length == 1) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[0][i]);
            }
            return;
        }

        for (int i = 0; i < array[0].length; i++) {
            System.out.print(array[0][i] + " ");
        }
        System.out.println();

        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i][array[0].length - 1] + " ");
        }
        System.out.println();

        for (int i = array[0].length - 2; i >= 0; i--) {
            System.out.print(array[array.length - 1][i] + " ");
        }
        System.out.println();
        for (int i = array.length - 2; i > 0; i--) {
            System.out.print(array[i][0] + " ");
        }
        System.out.println();
    }
}





