package IPK.string;

public class SubSequenceCheck {
    public static void main(String[] args) {
        final String s1 = "geeksforgeeks";
        final String s2 = "grges";
        subSequence(s1, s2);
    }

    private static void subSequence(final String s1, final String s2) {
        int i = 0;
        int j = 0;
        if (s1.length() < s2.length()) System.out.println(false);
        while (s2.length() > j && i < s1.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == s2.length()) System.out.println(true);
        else System.out.println(false);
    }
}
