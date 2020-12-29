public class Practice {
    public static void main(String[] args) {
        String str = "Tact Coa";
        int[] table = buildCharacterCountTable(str);
        boolean res= oddModCount(table);
        System.out.println(res);
    }

    public static int[] buildCharacterCountTable(String str) {
        int[] table = new int[(Character.getNumericValue('z') - Character.getNumericValue('a') + 1)];
        for (char c : str.toCharArray()) {
            int x = getNumericValue(c);
            if (x != -1) {
                table[x]++;
            }
        }
        return table;
    }

    public static int getNumericValue(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int value = Character.getNumericValue(c);

        if (a <= value && value <= z) {
            return value - a;
        }
        return -1;
    }

    public static boolean oddModCount(int[] table) {
        boolean oddmod = false;
        for (int i : table) {
            if (i % 2 == 1) {
                if (oddmod) {
                    return false;
                }
                oddmod = true;
            }
        }
        return true;
    }
}
