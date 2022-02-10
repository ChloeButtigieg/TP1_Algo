package utils;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayUtil {
    public static void swap (ArrayList<Integer> array, int i, int j) {
        Integer save = array.get(j);
        array.set(j,  array.get(i));
        array.set(i, save);
    }

    public static int getMinIndex (ArrayList<Integer> array, int firstIndex, int secondIndex) {
        if (array.get(firstIndex) < array.get(secondIndex)) return firstIndex;
        return secondIndex;
    }

    public static ArrayList<Integer> createArrayList (int nbOfElement) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < nbOfElement; i++) {
            array.add((int) (Math.random() * 101));
        }
        return array;
    }

    public static LinkedList<Integer> createLinkedList (int nbOfElement) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nbOfElement; i++) {
            list.add((int) (Math.random() * 101));
        }
        return list;
    }
}
