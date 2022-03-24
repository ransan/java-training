package IPK.array;

public class RainwaterTrapProblem {

    public static void main(String[] args) {
        int[] array = {9, 2, 3, 4, 5};
        int[] lMax = new int[array.length];
        lMax[0] = array[0];
        int[] rMax = new int[array.length];
        rMax[array.length - 1] = array[array.length - 1];

        for (int i = 1; i < array.length;   i++) {
            lMax[i] = Math.max(array[i], lMax[i - 1]);
        }

        for (int i = array.length - 2; i >= 0; i--) {
            rMax[i] = Math.max(array[i], rMax[i + 1]);
        }

        int res = 0;
        for (int i = 1; i < array.length - 1; i++) {
            res = res + (Math.min(lMax[i], rMax[i]) - array[i]);
        }

        System.out.println(res);
    }
}
