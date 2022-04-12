package IPK.array;

public class LongestCommonSubString {
    public static void main(String[] args) {
        String s1 = "OldSite:GeeksforGeeks.org";
        String s2 = "NewSite:GeeksQuiz.com";
        int l1 = s1.length();
        int l2 = s2.length();
        LCS(s1, s2, l1, l2);
    }

    private static void LCS(String s1, String s2, int l1, int l2) {
        int[][] dp = new int[l1 + 1][l2 + 1];

        for (int i = 0; i <= l1; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= l2; i++) {
            dp[0][i] = 0;
        }

        int result = 0;
        for (int i = 1; i <= l1; i++) {
            for (int j = 1; j <= l2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 0;
                }
                result = Math.max(result, dp[i][j]);
            }
        }

        System.out.println(result);

        int end =0;
        for (int i = 0; i <= l1; i++) {
            for (int j = 0; j <= l2; j++) {
              if (dp[i][j] == result) {
                  end = i;
              }
            }
        }
        int start =  end - result;

        System.out.println(s1.substring(start, end));
    }
}
