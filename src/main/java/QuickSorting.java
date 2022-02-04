import utils.ArrayUtil;

import java.util.ArrayList;

public class QuickSorting {

    int flagDivision(ArrayList<Integer> array, int minIndex, int maxIndex, int pivotIndex) {
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

    void sorting(ArrayList<Integer> array, int minIndex, int maxIndex) {
        if (minIndex < maxIndex) {
            int pivotIndex = flagDivision(array, minIndex, maxIndex, minIndex);
            sorting(array, minIndex, pivotIndex - 1);
            sorting(array, pivotIndex + 1, maxIndex);
        }
    }
}
