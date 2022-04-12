package IPK.array;

public class ReArrangeAarrayAlternatively {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] res = new int[array.length];
        int i = 0;
        int j = array.length - 1;
        int middle =  1 + ((array.length) -1)/2;
        int m=0;
            while (i < j) {
                res[m++] = array[i];
                res[m++] = array[j];
                i++;
                j--;
            }

        for (int k = 0; k < res.length; k++) {
            System.out.print(res[k]);
        }
        System.out.print(middle);
    }
}
