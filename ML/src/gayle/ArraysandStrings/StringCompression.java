package gayle.ArraysandStrings;

public class StringCompression {
    public static void main(String[] args) {
        String input = "aabccccaa";
        int count =0;
        String compressedString = "";
        for (int i=0;i<input.length();i++){
            count++;
            if( i+1 >= input.length()|| input.charAt(i) != input.charAt(i+1)){
                compressedString += "" + input.charAt(i)+count;
                count=0;
            }
        }
        System.out.println(compressedString);
    }
}
