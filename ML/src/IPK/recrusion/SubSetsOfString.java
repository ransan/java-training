package IPK.recrusion;

public class SubSetsOfString {
    public static void main(String[] args) {
        String str = "abc";
        String sub = "";
        getSubSets(str, sub, 0);
    }

    private static void getSubSets(String str, String sub, int start) {
        if (start == str.length()) {
            System.out.println(sub);
            return;
        }
        getSubSets(str, sub, start + 1);
        getSubSets(str, sub + str.charAt(start), start + 1);
    }
}
