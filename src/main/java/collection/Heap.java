package collection;

import utils.ArrayUtil;

import java.util.ArrayList;

public class Heap {
    private final ArrayList<Integer> heap = new ArrayList<>();

    public Heap (ArrayList<Integer> array) {
        for (int index = 0; index < array.size(); index++) {
            add(array.get(index));
        }
    }

    public void add (Integer element) {
        this.heap.add(element);
        updateAfterAddingElement(this.heap.size() - 1);
    }

    public Integer poll () {
        if (this.heap.isEmpty()) return null;

        ArrayUtil.swap(this.heap, 0, this.heap.size() - 1);
        Integer removedElement = this.heap.remove(this.heap.size() - 1);
        updateAfterRemovingElement(0);
        return removedElement;
    }

    private void updateAfterAddingElement (int index) {
        if (index > 0) {
            int fatherIndex = getFatherIndex(index);
            if (heap.get(fatherIndex) > heap.get(index)) {
                ArrayUtil.swap(this.heap, fatherIndex, index);
                updateAfterAddingElement(fatherIndex);
            }
        }
    }

    private void updateAfterRemovingElement (int index) {
        int leftSonIndex = getLeftSonIndex(index);
        int rightSonIndex = getRightSonIndex(index);

        if (leftSonIndex == -1 && rightSonIndex != -1) {
            if (this.heap.get(index) > this.heap.get(leftSonIndex)) {
                ArrayUtil.swap(this.heap, index, leftSonIndex);
            }
        }
        if (leftSonIndex != -1 && rightSonIndex != -1) {
            int smallerSonIndex = ArrayUtil.getMinIndex(this.heap, leftSonIndex, rightSonIndex);
            if (this.heap.get(index) > this.heap.get(smallerSonIndex)) {
                ArrayUtil.swap(this.heap, index, smallerSonIndex);
                updateAfterRemovingElement(smallerSonIndex);
            }
        }
    }

    private int getFatherIndex (int sonIndex) {
        if (sonIndex == 0) return 0;
        if (sonIndex % 2 == 1) sonIndex++;

        int pairNumberIndex = 0;
        while (sonIndex != 2 * (pairNumberIndex + 1)) {
            pairNumberIndex++;
        }
        return sonIndex - 2 - pairNumberIndex;
    }

    private int getRightSonIndex (int indexFather) {
        int sonIndex = 2 * indexFather + 2;
        if (sonIndex >= this.heap.size()) return -1;
        return sonIndex;
    }

    private int getLeftSonIndex (int indexFather) {
        int sonIndex = 2 * indexFather + 1;
        if (sonIndex >= this.heap.size()) return -1;
        return sonIndex;
    }
}
