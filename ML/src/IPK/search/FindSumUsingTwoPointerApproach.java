package IPK.search;

public class FindSumUsingTwoPointerApproach {
    public static void main(String[] args) {
        int[] array = {2, 4, 8, 9, 11, 12, 20, 30};
        int sum = 23;
        System.out.println(findPair(array, sum, 0, array.length - 1));
        System.out.println(findTriplet(array, sum));
    }

    public static boolean findPair(int[] array, int sum, int left, int right) {
        while (left <= right) {
            if (array[left] + array[right] == sum) {
                return true;
            } else if (array[left] + array[right] > sum) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }

    public static boolean findTriplet(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            return findPair(array, Math.abs(array[i] - sum), i + 1, array.length - 1);
        }
        return false;
    }
}
