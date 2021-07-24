package geeksforgeeks.practice;

public class MakeArrayProductOne {
    public static void main(String[] args) {
        int[] array = {1, -1};
        int n = array.length;
        int zero = 0;
        int negativeNumber = 0;
        int steps = 0;
        for (int i = 0; i < n; i++) {
            int number = array[i];
            if (number == 0) {
                zero += 1;
            }
            if (number > 0) {
                steps += number - 1;
            } else if (number < 0) {
                steps = -1 - number;
                negativeNumber += 1;
            }
        }
        if (negativeNumber % 2 == 0) {
            steps = steps + zero;
        } else {
            if (zero > 0) {
                steps = steps + zero;
            } else {
                steps = steps + 2;
            }
        }
        System.out.println("Steps : " + steps);
    }
}
