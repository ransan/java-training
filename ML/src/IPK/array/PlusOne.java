package IPK.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * add plus 1 to last digit
 */
public class PlusOne {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9); //3 7 2 7 2 8 4 4 3 4
        /**
        list.add(7);
        list.add(2);
        list.add(7);
        list.add(2);
        list.add(8);
        list.add(4);
        list.add(4);
        list.add(3);
        list.add(4);
         **/
        ArrayList<Integer> resList = plusOne(list, list.size());
        System.out.print(resList);

    }

    private static ArrayList<Integer> plusOne(ArrayList<Integer> list, int size) {
        Integer[] arr = list.stream().toArray(Integer[]::new);
        ArrayList<Integer> resList = new ArrayList<>(list.size());
        if (size == 1) {
            resList.add(list.get(0) + 1);
            return resList;
        }

        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arrayToList(arr);
            }
            arr[i] = 0;
        }

        Integer[] newNumber = new Integer[size + 1];
        Arrays.fill(newNumber, 0);
        newNumber[0] = 1;
        return arrayToList(newNumber);
    }

    private static ArrayList<Integer> arrayToList(Integer[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return list;
    }
}
