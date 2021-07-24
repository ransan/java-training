package geeksforgeeks.array.IPK.bit_magic;

public class FindNumberOddOrEven {
    public static void main(String[] args) {
        int number = 9;
        if ((number & 1) == 0) {
            System.out.println("Given Number is Even");
        } else {
            System.out.println("Given Number is ODD");
        }
    }
}
