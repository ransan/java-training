package IPK.array;

import java.util.Objects;

public class MajorityElement {
    public static void main(String[] args) {
        int[] array = {8, 3, 4, 8, 8};
        int size = array.length;
        int res = getMajority(array, size);
        int data = checkMajority(res, size, array);
        System.out.println(data);
    }

    private static int getMajority(int[] array, int size) {
        int res = 0;
        int count = 1;
        for (int i = 1; i < size; i++) {
            if (array[res] == array[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                res = i;
                count = 1;
            }
        }
        return res;
    }

    private static int checkMajority(int res, int size, int[] array) {
        int count = 0;
        for (int i=0; i<size; i++) {
            if (array[res] == array[i]) {
                count++;
            }
        }
        if (count <= (size/2)) {
            return -1;
        }
        return res;
    }
}


class KeyValuePair {
    private int key;
    private int value;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof KeyValuePair)) return false;
        KeyValuePair that = (KeyValuePair) o;
        return getKey() == that.getKey() && getValue() == that.getValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKey(), getValue());
    }

    @Override
    public String toString() {
        return "KeyValuePair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
