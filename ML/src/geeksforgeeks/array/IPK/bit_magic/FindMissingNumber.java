package geeksforgeeks.array.IPK.bit_magic;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 3, 4};
        int b = 0;
        for (int i = 1; i < array.length; i++) {
            b = b ^ array[i];
        }
        for (int i = 2; i <= array.length + 1; i++) {
            b = b ^ i;
        }
        System.out.println(b);
    }
}
