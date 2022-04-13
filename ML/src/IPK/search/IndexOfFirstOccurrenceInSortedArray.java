package IPK.search;

public class IndexOfFirstOccurrenceInSortedArray {
    public static void main(String[] args) {
        int[] array = {5, 10, 10, 10, 15, 20, 20, 20};
        int target = 10;
        int size = array.length - 1;
        System.out.println(firstOccurrence(array, 0, size, target));
        System.out.println(lastOccurrence(array, 0, size, target));
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
            if (mid == array.length - 1 || array[mid+1] != array[mid]) {
                return mid;
            } else {
                return lastOccurrence(array, mid + 1, right, target);
            }
        }
    }
}
