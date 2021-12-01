package IPK.string;

public class PatternMatching {
    public static void main(String[] args) {
        final String s1 = "ABCABCDABCD";
        final String s2 = "ABCD";
        naivePatternMatch(s1, s2);
    }

    private static void naivePatternMatch(final String s1, final String s2) {
        int m = s2.length();
        int n = s1.length();
        if (n < m) {
            System.out.println("No match");
            return;
        }
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (s2.charAt(j) != s1.charAt(i + j)) {
                    break;
                }
            }
            if (m == j) {
                System.out.print(i + " ");
            }
        }

    }
}
