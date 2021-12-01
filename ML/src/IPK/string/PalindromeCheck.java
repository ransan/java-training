package IPK.string;

public class PalindromeCheck {
    public static void main(String[] args) {
        final String str = "ABCDCBA";
        isPalindrome1(str);
        isPalindrome2(str);
        isPalindrome3(str);
    }

    // naive 1
    private static void isPalindrome1(final String str) {
        String temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            temp += str.charAt(i);
        }
        System.out.println(temp.equals(str));
    }


    // naive 2
    private static void isPalindrome2(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        System.out.println(builder.toString().equals(str));
    }

    private static void isPalindrome3(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
        return;
    }
}
