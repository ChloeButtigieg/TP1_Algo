package sortings;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class HeapSortingEasy {
    public ArrayList<Integer> sorting(ArrayList<Integer> array) {
        PriorityQueue<Integer> head = new PriorityQueue<>(array);
        ArrayList<Integer> sortedArray = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            sortedArray.add(head.poll());
        }
        return sortedArray;
    }
}
