package geeksforgeeks.practice;

public class GenerateSubSet {
    public static void main(String[] args) {
        String str = "abc";
        String out = "";
        generateSubSet(str, 0, out);
    }

    private static void generateSubSet(String str, int i, String out) {
        if (i == str.length()) {
            System.out.println(out);
            return;
        }
        generateSubSet(str, i+1, out);
        generateSubSet(str, i+1, out+str.charAt(i));
    }
}
