package IPK.array;

public class MaximumDifferenceInArray {
    public static void main(String[] args) {
        int[] array = {2, 3, 10, 6, 4, 8, 1};
        int minValue = array[0];
        int result = array[0] - array[1];
        for (int i = 1; i < array.length; i++) {
            result = Math.max(result, array[i] - minValue);
            minValue = Math.min(minValue, array[i]);
        }
        System.out.println(result);
    }
}
