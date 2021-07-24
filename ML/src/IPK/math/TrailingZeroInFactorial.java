package IPK.math;

// Time Complexity O(loglogN)
// Space complexity O(1)
public class TrailingZeroInFactorial {
    public static void main(String[] args) {
        int number = 251;
        int response = 0;
        for (int i=5;i<=number;i=i*5) {
            response = response + number/i;
        }
        System.out.println(response);
    }
}
