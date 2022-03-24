package IPK.array;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        // int[] array = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };
        int[] array = {1, 2, 3, 4, 5, 1};

        for (int i = 0; i < array.length; i++) {
            int val = array[array[i] % array.length] + array.length;
            int index = array[i] % array.length;
            array[index] = val;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= array.length * 2) {
                System.out.print(i + " ");
            }
        }
    }
}
