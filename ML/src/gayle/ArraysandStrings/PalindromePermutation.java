package gayle.ArraysandStrings;

public class PalindromePermutation {
    public static void main(String[] args) {
        String str = "Tact Co";
        int[] res = buildCharFrequencyTable(str);
        boolean ele = checkMaxOdd(res);
        System.out.println(ele);
    }

    public static int[] buildCharFrequencyTable(String str) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char ele : str.toCharArray()){
            int x = getCharNumber(ele);
            if(x !=  -1) {
                table[x]++;
            }
        }
        return table;
    }

    public static int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int value = Character.getNumericValue(c);
        if(a <= value && value <= z) {
           return value - a;
        }
        return -1;
    }

    public static boolean checkMaxOdd(int[] table) {
        boolean foundOdd = false;
        for (int ele : table) {
            if (ele%2 == 1){
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }
}
