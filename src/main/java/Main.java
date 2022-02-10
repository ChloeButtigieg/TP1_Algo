import sortings.BubbleSort;
import sortings.FusionSort;
import sortings.HeapSort;
import sortings.QuickSort;
import utils.ArrayUtil;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main (String[] args) {
        bubbleSort();
        fusionSort();
        quickSort();
        heapSort();
    }

    public static void bubbleSort () {
        ArrayList<Integer> array = ArrayUtil.createArrayList(10);
        System.out.println("BubbleSort :\n" + array);
        BubbleSort.sort(array);
        System.out.println(array);
    }

    public static void fusionSort () {
        LinkedList<Integer> linkedList = ArrayUtil.createLinkedList(10);
        System.out.println("\nFusionSort :\n" + linkedList);
        System.out.println(FusionSort.sort(linkedList));
    }

    public static void quickSort () {
        ArrayList<Integer> array = ArrayUtil.createArrayList(10);
        System.out.println("\nQuickSort :\n" + array);
        QuickSort.sort(array, 0, array.size() - 1);
        System.out.println(array);
    }

    public static void heapSort () {
        ArrayList<Integer> array = ArrayUtil.createArrayList(10);
        System.out.println("\nHeapSort :\n" + array);
        System.out.println(HeapSort.sortWithPriorityQueue(array));
        System.out.println(HeapSort.sort(array));
    }
}
