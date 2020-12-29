package gayle.ArraysandStrings;

public class isUniqueString {
    public static void main(String[] args) {
        String str = "Ranjith";
        String res =  isUnique(str);
        System.out.println(res);
    }

    public static String isUnique(String str) {
        boolean[] array = new boolean[128];
        for(int i=0;i< str.length();i++) {
            int value = str.charAt(i);
            if(array[value]) {
                return "String is not Unique";
            }
            array[value] = true;
        }
        return "String is Unique";
    }
}
