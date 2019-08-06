import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列实现栈
 */
public class Solution225 {
    Queue<Integer> queue;

    /**
     * Initialize your data structure here.
     */
    public Solution225() {
        queue = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.offer(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        Queue<Integer> temp = new LinkedList<>();
        while (queue.size() > 1) {
            temp.offer(queue.poll());
        }
        int res = queue.poll();
        while (!temp.isEmpty()){
            queue.offer(temp.poll());
        }
        return res;
    }

    /**
     * Get the top element.
     */
    public int top() {
        Queue<Integer> temp = new LinkedList<>();
        while (queue.size() > 1) {
            temp.offer(queue.poll());
        }
        int res = queue.poll();
        temp.offer(res);
        while (!temp.isEmpty()){
            queue.offer(temp.poll());
        }
        return res;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
    }
}
