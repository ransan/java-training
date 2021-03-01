package geeksforgeeks.array;

public class PrintAlternativeElement {
    public static void main (String[] args) {
        int[] array = {1,2,3,4,5};
        int start = 0;
        int end = array.length;
        while (start < end) {
            System.out.println(array[start]);
            start = start+2;
        }
    }
}
