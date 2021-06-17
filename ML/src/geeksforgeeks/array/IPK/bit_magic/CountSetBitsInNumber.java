package geeksforgeeks.array.IPK.bit_magic;

public class CountSetBitsInNumber {
    public static void main(String[] args) {
        int number = 5;
        int res = 0;
        while (number > 0) {
            number = (number & (number -1));
            ++res;
        }
        System.out.println(res);
    }
}
