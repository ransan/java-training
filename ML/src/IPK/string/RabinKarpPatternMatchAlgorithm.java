package IPK.string;

import java.util.LinkedList;
import java.util.List;

public class RabinKarpPatternMatchAlgorithm {
    public final static int d = 256;

    public static void main(String[] args) {
        String text = "abdabcbabc";
        String pat = "abc";
        int q = 101;
        rabinKarp(pat, text, q);
    }

    private static void rabinKarp(String pat, String text, int q) {
        int M = pat.length();
        int N = text.length();
        List<Integer> list = new LinkedList<>();

        int i, j;
        int p = 0;
        int t = 0;
        int h = 1;
        //int d = 256;

        for (i = 0; i < M - 1; i++) {
            h = (h * d) % q;
        }

        for (i = 0; i < M; i++) {
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + text.charAt(i)) % q;
        }

        for (i = 0; i <= N - M; i++) {
            if (p == t) {
                for (j = 0; j < M; j++) {
                    if (text.charAt(i + j) != pat.charAt(j)) {
                        break;
                    }
                }
                if (j == M) {
                    list.add(i);
                }
            }
            if (i < N - M) {
                t = (d * (t - text.charAt(i) * h) + text.charAt(i + M)) % q;
                if (t < 0) {
                    t = t + q;
                }
            }
        }
        System.out.println(list);
    }
}
