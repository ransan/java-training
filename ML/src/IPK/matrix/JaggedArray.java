package IPK.matrix;

public class JaggedArray {
    public static void main(String[] args) {
        int m = 3;
        int[][] array = new int[m][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i + 1];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
