package IPK.bit_magic;

public class FindOddOccuringNumber {
    public static void main(String[] args) {
        int[] array = {4, 3, 4, 4, 4, 5, 5, 3, 3};
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            res = res ^ array[i];
        }
        System.out.println(res);
    }
}
