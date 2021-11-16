package IPK.array;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 30, 30, 30};
        int res = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[res - 1]) {
                array[res] = array[i];
                res++;
            }
        }
        System.out.println(res);
    }
}
