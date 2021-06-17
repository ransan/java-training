package geeksforgeeks.array.IPK.math;

public class ComputationOfPower {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        System.out.println(computePower(a, b));
    }

    private static double computePower(int num, int power) {
        return Math.pow(num, power);
    }
}
