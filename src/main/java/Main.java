import utils.ArrayUtil;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main (String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(1);
        myArray.add(6);
        myArray.add(2);
        myArray.add(1);
        myArray.add(4);
        System.out.println(myArray);
        QuickSorting sort = new QuickSorting();
        sort.sorting(myArray, 0, myArray.size() - 1);
        System.out.println(myArray);
    }
}
