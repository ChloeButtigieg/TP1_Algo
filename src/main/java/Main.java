import sortings.HeapSortingEasy;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(1);
        myArray.add(6);
        myArray.add(2);
        myArray.add(1);
        myArray.add(4);
        System.out.println(myArray);
        HeapSortingEasy sort = new HeapSortingEasy();
        System.out.println(sort.sorting(myArray));
    }
}
