package geeksforgeeks.array.IPK.math;

public class CheckOddOrEven {
    public static void main(String[] args) {
        int num = 10;
        if ((num & 1) != 0) {
            System.out.println("Num is ODD");
        } else {
            System.out.println("Num is Even");
        }
        int n = num << 2;
        System.out.println(n);
    }
}
