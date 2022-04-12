package IPK.array;

public class InversionInArray {
    public static void main(String[] args) {
        int[] array = {9, 6, 8, 4};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i] > array[j]) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
