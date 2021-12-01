package IPK.string;

public class AnagramCheck {
    private static final int CHAR = 256;

    public static void main(String[] args) {
        final String s1 = "abc";
        final String s2 = "acd";
        isAnagram(s1, s2);
    }

    private static void isAnagram(final String s1, final String s2) {
        int[] count = new int[CHAR];
        if (s1.length() != s2.length()) System.out.println(false);
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int i = 0; i < CHAR; i++) {
            if (count[i] != 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
