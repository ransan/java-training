package IPK.array;

import java.util.Arrays;

public class AppleCollectProblem {

    public static void main(String[] args) {
        int[] array = {6, 1, 4, 6, 3, 2, 7, 4};
        int result = solution(array, 3, 2);
        System.out.println(result);
    }

    public static int solution(int[] A, int K, int L) {
        if (A.length < (K + L)) {
            return -1;
        }

        if (A.length == (K + L)) {
            return Arrays.stream(A).boxed().mapToInt(e -> e).reduce(0, Math::addExact);
        }

        int n = A.length;
        int[] pre = new int[n];

        for (int i = 0; i < n; i++) {
            pre[i] = i == 0 ? A[i] : A[i] + pre[i - 1];
        }

        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i + L - 1; j < n; j++) {
                dp[i][j] = j == L - 1 ? pre[j] : Math.max(dp[i][j - 1], (pre[j] - pre[j - L]));
            }
        }

        int res = 0;

        for (int i = 0; i + K - 1 < n; i++) {
            int M = i == 0 ? pre[i + K - 1] : (pre[i + K - 1] - pre[i - 1]);
            int N = Math.max(i == 0 ? 0 : dp[0][i - 1], i + K > n - 1 ? 0 : dp[i + K][n - 1]);
            res = Math.max(res, (M + N));
        }
        return res;
    }
}
