package utils;

import java.util.ArrayList;

public class ArrayUtil {
    public static void swap(ArrayList<Integer> array, int i, int j) {
        Integer save = array.get(j);
        array.set(j,  array.get(i));
        array.set(i, save);
    }
}
