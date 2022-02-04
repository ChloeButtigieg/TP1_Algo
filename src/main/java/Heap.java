import java.util.ArrayList;

public class Heap {
    private ArrayList<Integer> heap;

    public Heap (ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            heap.add(array.get(i));

        }
    }

    private void update(int index) {
        if (index < 0) {

        }
    }
}
