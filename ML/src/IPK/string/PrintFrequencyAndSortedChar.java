package IPK.string;

public class PrintFrequencyAndSortedChar {
    public static void main(String[] args) {
        final String str = "geeksforgeeks";
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) (i + 'a') + " " + count[i]);
            }
        }
    }
}
