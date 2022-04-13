package IPK.search;

public class Count1sInSortedBinaryArray {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 1, 1, 1, 1, 1, 1};
        int f1 = firstOccurrence(array, 0, array.length - 1, 1);
        if (f1 == -1) return;
        int f2 = lastOccurrence(array, 0, array.length - 1, 1);
        System.out.println(f2 - f1 + 1);
    }

    private static int firstOccurrence(int[] array, int left, int right, int target) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (array[mid] < target) {
            return firstOccurrence(array, mid + 1, right, target);
        } else if (array[mid] > target) {
            return firstOccurrence(array, left, mid - 1, target);
        } else {
            if (mid == 0 || array[mid - 1] != 1) {
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
        } else if (array[mid] < target) {
            return lastOccurrence(array, left, mid - 1, target);
        } else {
            if (mid == array.length - 1 || array[mid + 1] != 1) {
                return mid;
            } else {
                return lastOccurrence(array, mid + 1, right, target);
            }
        }
    }
}
