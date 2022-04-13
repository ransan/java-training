package IPK.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {60, 60};
        int size = array.length - 1;
        System.out.println(search(array, 60, 0, size));
        System.out.println(searchRec(array, 60, 0, size));
    }

    private static int searchRec(int[] array, int target, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (array[mid] == target) return mid;
        if (array[mid] < target) {
            return searchRec(array, target, mid + 1, right);
        } else if (array[mid] > target) {
            return searchRec(array, target, left, mid - 1);
        } else {
            return mid;
        }
    }

    private static int search(int[] array, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) return mid;
            if (array[mid] < target)
                left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
