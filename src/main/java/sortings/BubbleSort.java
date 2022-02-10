package sortings;

import utils.ArrayUtil;

import java.util.ArrayList;

public class BubbleSort {
    public static void sort(ArrayList<Integer> array) {
        for (int i = array.size()-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array.get(j) > array.get(j+1)) {
                    ArrayUtil.swap(array, j, j+1);
                }
            }
        }
    }
}
