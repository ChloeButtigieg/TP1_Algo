import java.util.LinkedList;

public class FusionSorting {

    private LinkedList<Integer> fusion(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> fusion = new LinkedList<>();
        while (list1.size() != 0 && list2.size() != 0) {
            if (list1.getFirst() <= list2.getFirst()) {
                fusion.add(list1.getFirst());
                list1.removeFirst();
            } else {
                fusion.add(list2.getFirst());
                list2.removeFirst();
            }
        }
        if (list1.size() == 0) {
            fusion.addAll(list2);
        } else {
            fusion.addAll(list1);
        }
        return fusion;
    }

    public LinkedList<Integer> sorting(LinkedList<Integer> list) {
        if (list.size() > 1) {
            LinkedList<Integer> list1 = new LinkedList<>();
            LinkedList<Integer> list2 = new LinkedList<>();
            for (int i = 0; i < list.size(); i++) {
                if  (i%2 == 0) {
                    list1.add(list.get(i));
                } else {
                    list2.add(list.get(i));
                }
            }
            list1 = sorting(list1);
            list2 = sorting(list2);
            list = fusion(list1, list2);
        }
        return list;
    }
}
