package sortings;

import collection.Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class HeapSort {
    public static ArrayList<Integer> sortWithPriorityQueue (ArrayList<Integer> array) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(array);
        ArrayList<Integer> sortedArray = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            sortedArray.add(heap.poll());
        }
        return sortedArray;
    }

    public static ArrayList<Integer> sort (ArrayList<Integer> array) {
        Heap heap = new Heap(array);
        ArrayList<Integer> sortedArray = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            sortedArray.add(heap.poll());
        }
        return sortedArray;
    }
}
