import utils.ArrayUtil;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(5);
        myArray.add(1);
        myArray.add(2);
        myArray.add(4);
        myArray.add(3);
        BubbleSorting sort = new BubbleSorting();
        System.out.println(myArray);
        sort.sorting(myArray);
        System.out.println(myArray);
    }
}
