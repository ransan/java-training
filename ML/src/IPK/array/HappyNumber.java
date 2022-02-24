package IPK.array;

import java.util.HashSet;
import java.util.Set;

/**
 * isHappy(n)
 */
public class HappyNumber {
    public static void main(String[] args) {
        int number = 29;
        System.out.print(isHappy(number));
    }

    private static boolean isHappy(int number) {
        Set<Integer> set = new HashSet<>();
        while (true) {
            int square = 0;
            while (number > 0) {
                int digit = number % 10;
                square = square + (digit * digit);
                number = number / 10;
            }
            if (square == 1) {
                return true;
            } else if (set.contains(square)) {
                return false;
            }
            set.add(square);
            number = square;
        }
    }
}
