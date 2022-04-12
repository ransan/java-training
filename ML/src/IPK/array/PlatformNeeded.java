package IPK.array;

public class PlatformNeeded {
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        int n = arr.length;
        minimumPlatform(arr, dep, n);
    }

    private static void minimumPlatform(int[] arr, int[] dep, int n) {
        int max_need = 1;
        int result = 1;
        int i = 1;
        int j = 0;
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                max_need++;
                i++;
                if (max_need > result) {
                    result = max_need;
                }
            } else {
                max_need--;
                j++;
            }
        }

        System.out.print(result);
    }

}
