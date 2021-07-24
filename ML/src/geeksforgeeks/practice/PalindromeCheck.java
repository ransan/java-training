package geeksforgeeks.practice;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str ="aba";
        int length = str.length();
        System.out.println(isPalindrome(str, 0, length-1));
    }

    private static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        return String.valueOf(str.charAt(start)).equals(String.valueOf(str.charAt(end)))  && isPalindrome(str, start+1, end -1);
    }
}
