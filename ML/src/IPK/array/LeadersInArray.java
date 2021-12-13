package IPK.array;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] array = {7, 4, 10, 3, 10, 6, 5, 2};
        int leader = array[array.length - 1];
        System.out.println(leader);
        for (int i = array.length - 2; i >= 0; i--) {
            if (leader < array[i]) {
                leader = array[i];
                System.out.println(leader);
            }
        }
    }
}
