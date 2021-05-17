package algorithm.basics;

import java.util.Arrays;

public class GenerateNStrings {
    int[] array;
    public GenerateNStrings(final int n) {
        int[] array =  new int[n];
    }

    public void binaryString(int n) {
        if (n <= 0) {
            System.out.print(Arrays.toString(array));
        } else {
            array[n-1] = 0;
            binaryString(n-1);
            array[n-1] = 1;
            binaryString(n-1);
        }
    }
    public static void main(String[] args) {
        GenerateNStrings generateNStrings = new GenerateNStrings(4);
        generateNStrings.binaryString(4);
    }
}
