package geeksforgeeks.practice;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n =3;
        System.out.println(sum(n, 1));
    }

    public static int sum(int n, int k) {
        if (n == 1) return k;
        else return sum(n-1, n+k);
    }
}
