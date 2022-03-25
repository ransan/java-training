package IPK.string;

public class ReverseString {
    public static void main(String[] args) {
        final String s1 = "gfg";
        reverse(s1);
    }

    private static void reverse(final String s1) {
        String[] words = s1.split(" ");
        String res ="";
        for (int i = words.length - 1; i >= 0; i--) {
             res = res + words[i] + " ";
        }
        System.out.println(res.trim());
    }
}
