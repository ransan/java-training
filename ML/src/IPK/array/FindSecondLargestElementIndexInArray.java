package IPK.array;

public class FindSecondLargestElementIndexInArray {
    public static void main(String[] args) {
        int[] array = {5, 20, 12, 20, 8};
        System.out.println(secondLargest(array));
    }

    public static int secondLargest(int[] array) {
        int largest = 0;
        int secondLargest = -1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[largest]) {
                secondLargest = largest;
                largest = i;
            } else if (array[i] != array[largest]) {
                if (array[i] > array[secondLargest] || secondLargest == -1) {
                    secondLargest = i;
                }
            }
        }
        return secondLargest;
    }
}
