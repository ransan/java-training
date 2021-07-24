package IPK.math;

import java.util.Arrays;

// Time Complexity O(nloglogn)
public class SeiveOfErantosthenes {
    public static void main(String[] args) {
        int number = 5;
        boolean[] array = new boolean[number + 1];
        Arrays.fill(array, true);
        for (int i = 2; i <= number; i++) {
            if (array[i]) {
                System.out.println(i);
                for (int j = i * i; j <= number; j = j + i) {
                    array[j] = false;
                }
            }
        }
    }
}
