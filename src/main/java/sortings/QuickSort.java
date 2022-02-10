package sortings;

import utils.ArrayUtil;

import java.util.ArrayList;

public class QuickSort {

    private static int flagDivision(ArrayList<Integer> array, int minIndex, int maxIndex, int pivotIndex) {
        int firstEqualElementIndex = pivotIndex;
        int currentPosition = pivotIndex + 1;
        int firstGreaterElementIndex = maxIndex + 1;
        while (currentPosition < firstGreaterElementIndex) {
            if (array.get(currentPosition) < array.get(pivotIndex)) {
                ArrayUtil.swap(array, currentPosition, firstEqualElementIndex);
                firstEqualElementIndex++;
                pivotIndex++;
                currentPosition++;
            } else if (array.get(currentPosition) > array.get(pivotIndex)) {
                ArrayUtil.swap(array, currentPosition, firstGreaterElementIndex - 1);
                firstGreaterElementIndex--;
            } else {
                currentPosition++;
                pivotIndex++;
            }
        }
        return pivotIndex;
    }

    public static void sort(ArrayList<Integer> array, int minIndex, int maxIndex) {
        if (minIndex < maxIndex) {
            int pivotIndex = flagDivision(array, minIndex, maxIndex, minIndex);
            sort(array, minIndex, pivotIndex - 1);
            sort(array, pivotIndex + 1, maxIndex);
        }
    }
}
