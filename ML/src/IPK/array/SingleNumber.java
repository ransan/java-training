package IPK.array;

public class SingleNumber {
    public static void main(String[] args) {
        int[] array = {4, 1, 2, 1, 2};
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            res ^= array[i];
        }
        System.out.print(res);
    }
}
