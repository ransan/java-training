package geeksforgeeks.array.IPK.math;

import java.util.Arrays;

public class QuadraticEquationRoots {
    public static void main(String[] args) {
        int a = 752;
        int b = 904;
        int c = 164;
        double d = (Math.sqrt((Math.pow(b, 2) -  (4 * a * c))));
        double root1 = Math.floor((-b + d)/ (2 * a));
        double root2 = (-b - d)/ (2 * a);
        Arrays.asList(root1, root2);
        System.out.println(root1);
        System.out.println(root2);
    }
}
