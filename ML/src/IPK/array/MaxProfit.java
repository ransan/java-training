package IPK.array;

public class MaxProfit {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 6;
        // System.out.print(maxProfit(arr, 0, n - 1));
        System.out.print(maxProfit(arr, arr.length));
    }

    private static int maxProfit(int[] array, int start, int end) {
        if (start <= 0) return 0;
        int profit = 0;
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (array[j] > array[i]) {
                    int curr_profit = array[j] - array[i] + maxProfit(array, start, i - 1)
                            + maxProfit(array, j + 1, end);
                    profit = Math.max(profit, curr_profit);
                }
            }
        }
        return profit;
    }

    private static int maxProfit(int[] array, int n) {
        int profit = 0;

        for (int i = 1; i < n; i++) {
            if (array[i] > array[i - 1]) {
                profit += (array[i] - array[i - 1]);
            }
        }
        return profit;
    }
}
