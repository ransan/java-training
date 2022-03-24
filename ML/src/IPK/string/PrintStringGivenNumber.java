package IPK.string;

public class PrintStringGivenNumber {
    public static void main(String[] args) {
        String str = "a2b3c4";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i = i + 2) {
            String s = String.valueOf(str.charAt(i));
            int size = Integer.parseInt(String.valueOf(str.charAt(i + 1)));
            for (int j = 0; j < size; j++) {
                builder.append(s);
            }
        }
        System.out.println(builder);
    }
}
