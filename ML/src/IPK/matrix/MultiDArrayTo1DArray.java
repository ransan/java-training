package IPK.matrix;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultiDArrayTo1DArray {
    public static void main(String[] args) {
        int[][] array = {
                {6, 7, 8, 9, 10},
                {1, 2, 3, 4, 5},
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {16, 17, 18, 19, 20}
        };
        int[] flatArray = Stream.of(array).flatMapToInt(IntStream::of).toArray();
        Arrays.sort(flatArray);
        int median = flatArray.length / 2;
        System.out.println(flatArray[median]);
        for (int i = 0; i < flatArray.length; i++) {
            System.out.println(flatArray[i]);
        }
    }
}
