package geeksforgeeks.array;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        String str = an.nextLine();
        String odd = "";
        String even = "";
        an.close();
        for (int i = 0; i < str.length(); i++) {
            String element = String.valueOf(str.charAt(i));
            if ((i % 2) == 0) {
                odd = odd + element;
                System.out.println(odd);
            } else {
                even = even + element;
            }
        }
        System.out.println(odd + "  " + even);
    }
}