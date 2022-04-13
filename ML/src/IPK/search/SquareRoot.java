package IPK.search;

public class SquareRoot {
    public static void main(String[] args) {
        int num = 15;
        int left = 1;
        int right = 15;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int square = mid * mid;
            if (square == num) {
                System.out.println(mid);
                return;
            } else if (square > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
                ans = mid;
            }
        }
        System.out.println(ans);
        System.out.println(Math.floor(Math.sqrt(num)));
    }
}
