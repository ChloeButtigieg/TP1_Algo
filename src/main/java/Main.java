import collection.Heap;
import sortings.HeapSorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(10, 9, 11, 8, 7, 20, 1, 6, 12, 4));
        System.out.println(array);
        HeapSorting sorting = new HeapSorting();
        System.out.println(sorting.sorting(array));
    }
}
