package utils;

import java.util.ArrayList;

public class ArrayUtil {
    public static void swap (ArrayList<Integer> array, int i, int j) {
        Integer save = array.get(j);
        array.set(j,  array.get(i));
        array.set(i, save);
    }

    public static int getMinIndex (ArrayList<Integer> array, int firstIndex, int secondIndex) {
        if (array.get(firstIndex) <= array.get(secondIndex)) return firstIndex;
        return secondIndex;
    }

    public static ArrayList<Integer> createArrayList (int length) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            array.add((int) (Math.random() * 101));
        }
        return array;
    }
}
