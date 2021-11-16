package IPK.array;

public class CheckIfArraySortedASC {
    public static void main(String[] args) {
        int[] array = {7, 20, 30, 10};
        if (isSorted(array)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not sorted");
        }
    }

    private static boolean isSorted(int[] array) {
        if (array.length == 1) return true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
