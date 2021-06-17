package geeksforgeeks.array.IPK.math;

// Time Complexity O(d) - d is Degit
public class PalindromeCheck {
    public static void main(String[] args) {
        int number = 78987;
        System.out.println(isPalindrome(number));
    }

    private static boolean isPalindrome(int number) {
        int reverse = 0;
        int num = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        if (num == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
