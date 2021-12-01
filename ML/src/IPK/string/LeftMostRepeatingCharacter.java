package IPK.string;

public class LeftMostRepeatingCharacter {
    private static final int CHAR = 256;

    public static void main(String[] args) {
        final String s1 = "abccbd";
        leftMostRepeatingCharacter(s1);
    }

    private static void leftMostRepeatingCharacter(final String s1) {
        int[] array = new int[CHAR];
        for (int i = 0; i < s1.length(); i++) {
            array[s1.charAt(i)]++;
        }
        for (int i = 0; i < CHAR; i++) {
            if (array[s1.charAt(i)] > 1) {
                System.out.println(String.valueOf((s1.charAt(i))));
                break;
            }
        }
    }
}
