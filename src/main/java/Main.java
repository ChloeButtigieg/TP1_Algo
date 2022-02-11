import sortings.BubbleSort;
import sortings.FusionSort;
import sortings.HeapSort;
import sortings.QuickSort;
import utils.ArrayUtil;
import utils.Timer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    private static final Timer TIMER = new Timer();

    public static void main (String[] args) {
        sorts(10);
        //compareTime(10000);
    }

    private static void sorts (int length) {
        ArrayList<Integer> array = ArrayUtil.createArrayList(length);
        System.out.println("\nBubbleSort :\n" + array + "\n" + bubbleSort(array));

        array = ArrayUtil.createArrayList(length);
        System.out.println("\nFusionSort :\n" + array + "\n" + fusionSort(array));

        array = ArrayUtil.createArrayList(length);
        System.out.println("\nQuickSort :\n" + array + "\n" + quickSort(array));

        array = ArrayUtil.createArrayList(length);
        System.out.println("\nHeapSort :\n" + array);
        System.out.println("PriorityQueue : " + heapSortWithPriorityQueue(array));
        System.out.println("Heap : " + heapSort(array));
    }

    private static void compareTime (int length) {
        ArrayList<Integer> array = ArrayUtil.createArrayList(length);
        System.out.println("\n*** COMPARE TIME ***\n");

        bubbleSort(array);
        System.out.println("BubbleSort : " + TIMER.getElapsedTime() + " s");

        fusionSort(array);
        System.out.println("FusionSort : " + TIMER.getElapsedTime() + " s");

        quickSort(array);
        System.out.println("QuickSort : " + TIMER.getElapsedTime() + " s");

        heapSortWithPriorityQueue(array);
        System.out.println("HeapSort PriorityQueue : " + TIMER.getElapsedTime() + " s");

        heapSort(array);
        System.out.println("HeapSort Heap : " + TIMER.getElapsedTime() + " s");
    }

    private static ArrayList<Integer> bubbleSort (ArrayList<Integer> array) {
        ArrayList<Integer> arrayCopy = new ArrayList<>(array);
        TIMER.restart();
        BubbleSort.sort(arrayCopy);
        TIMER.stop();
        return arrayCopy;
    }

    private static ArrayList<Integer> fusionSort (ArrayList<Integer> array) {
        LinkedList<Integer> linkedListCopy = new LinkedList<>(array);
        TIMER.restart();
        LinkedList<Integer> sortedLinkedList = FusionSort.sort(linkedListCopy);
        TIMER.stop();
        return new ArrayList<>(sortedLinkedList);
    }

    private static ArrayList<Integer> quickSort (ArrayList<Integer> array) {
        ArrayList<Integer> arrayCopy = new ArrayList<>(array);
        TIMER.restart();
        QuickSort.sort(arrayCopy, 0, array.size() - 1);
        TIMER.stop();
        return arrayCopy;
    }

    private static ArrayList<Integer> heapSortWithPriorityQueue (ArrayList<Integer> array) {
        TIMER.restart();
        ArrayList<Integer> sortedArray = HeapSort.sortWithPriorityQueue(array);
        TIMER.stop();
        return sortedArray;
    }

    private static ArrayList<Integer> heapSort (ArrayList<Integer> array) {
        TIMER.restart();
        ArrayList<Integer> sortedArray = HeapSort.sort(array);
        TIMER.stop();
        return sortedArray;
    }
}
