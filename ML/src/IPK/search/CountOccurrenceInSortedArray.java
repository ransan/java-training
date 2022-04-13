package IPK.search;

public class CountOccurrenceInSortedArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 20, 30, 30};
        int s1 = firstOccurrence(array, 0, array.length - 1, 20);
        if (s1 == -1) {
            System.out.println("Target nor found");
            return;
        }
        int s2 = lastOccurrence(array, 0, array.length - 1, 20);
        System.out.println("Count : " + ((s2 - s1) + 1));
    }

    private static int firstOccurrence(int[] array, int left, int right, int target) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (array[mid] < target) {
            return firstOccurrence(array, mid + 1, right, target);
        } else if (array[mid] > target) {
            return firstOccurrence(array, left, mid - 1, target);
        } else {
            if (mid == 0 || array[mid - 1] != array[mid]) {
                return mid;
            } else {
                return firstOccurrence(array, left, mid - 1, target);
            }
        }
    }

    private static int lastOccurrence(int[] array, int left, int right, int target) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (array[mid] < target) {
            return lastOccurrence(array, mid + 1, right, target);
        } else if (array[mid] > target) {
            return lastOccurrence(array, left, mid - 1, target);
        } else {
            if (mid == array.length - 1 || array[mid + 1] != array[mid]) {
                return mid;
            } else {
                return lastOccurrence(array, mid + 1, right, target);
            }
        }
    }
}
