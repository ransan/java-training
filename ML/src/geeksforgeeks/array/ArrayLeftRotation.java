package geeksforgeeks.array;

public class ArrayLeftRotation {
    public static void main (String[] args) {
        int[] array = {1,2,3,4,5};
        int rotation = 2;
        int start =0;
        int end= array.length;
        int mod = rotation % end;
        while (start < end) {
            System.out.println(array[(start + mod)%end]);
            start++;
        }
    }
}
