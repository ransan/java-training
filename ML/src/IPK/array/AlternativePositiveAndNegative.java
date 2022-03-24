package IPK.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * I/P : Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
 * O/P : 9 -2 4 -1 5 -5 0 -3 2
 */
public class AlternativePositiveAndNegative {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, -1, -2};
        int[] res = new int[array.length];
        alternative(array, res);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    private static void alternativeOn(int[] array, int[] res) {
        int pos = 0;
        int neg = 1;
        for (int ele : array) {
            if (ele >= 0) {
                res[pos] = ele;
                pos += 2;
            } else {
                res[neg] = ele;
                neg += 2;
            }
        }
    }

    private static void alternative(int[] array, int[] res) {
        List<Integer> positive = new LinkedList<>();
        List<Integer> negative = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positive.add(array[i]);
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negative.add(array[i]);
            }
        }
        int posSize = positive.size();
        int negSize = negative.size();
        if (posSize > negSize) {
            List<Integer> negativeIndex = getIndex(negSize, "NEG");

            for (int i = 0; i < negativeIndex.size(); i++) {
                positive.add(negativeIndex.get(i), negative.get(i));
            }

            for (int i = 0; i < positive.size(); i++) {
                res[i] = positive.get(i);
            }

        } else {
            List<Integer> positiveIndex = getIndex(posSize, "POS");

            for (int i = 0; i < positiveIndex.size(); i++) {
                negative.add(positiveIndex.get(i), positive.get(i));
            }
            for (int i = 0; i < negative.size(); i++) {
                res[i] = negative.get(i);
            }
        }
    }

    private static List<Integer> getIndex(int size, String type) {
        List<Integer> list = new ArrayList<>();
        if ("POS".equals(type)) {
            for (int i = 0; i < size; i++) {
                list.add(i * 2);
            }
        } else if ("NEG".equals(type)) {
            for (int i = 1; i <= size; i++) {
                list.add(i * 2 - 1);
            }
        }
        return list;
    }
}
