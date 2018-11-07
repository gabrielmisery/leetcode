import java.util.ArrayList;
import java.util.List;

class MyStack {
    private List<Integer> list = new ArrayList<>();

    void push(int element) {
        list.add(element);
    }

    int pop() {
        int temp = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return temp;
    }

    boolean empty() {
        return list.isEmpty();
    }
}
