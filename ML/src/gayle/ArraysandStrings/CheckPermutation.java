package gayle.ArraysandStrings;

import java.util.Arrays;

public class CheckPermutation {
    public static void main(String[] args) {
       String input = "god";
       String cpmInput =  "dog";
       if(input.length() !=  cpmInput.length()) System.out.println("String are not Combination of Permutation");
       if ( sort(input).equals(sort(cpmInput)) ) {
           System.out.println("String are Combination of Permutation");
       } else {
           System.out.println("String are not Combination of Permutation");
       }
    }
    public static String sort(String str) {
        char[] array = str.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}
