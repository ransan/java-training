package IPK.array;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] array = {10, 8, 0, 0, 12, 0};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                int temp = array[i];
                array[i] = array[count];
                array[count] = temp;
                count++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
