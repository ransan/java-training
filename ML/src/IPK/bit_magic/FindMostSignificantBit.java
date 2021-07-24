package IPK.bit_magic;

public class FindMostSignificantBit {
    public static void main(String[] args) {
        int number = 10;
        int ans = (int) ((Math.log10(number)) / (Math.log10(2)));
        System.out.println(Math.pow(2, ans));
    }
}
