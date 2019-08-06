import java.util.Stack;

/**
 * 用栈实现队列
 */
public class Solution232 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    /**
     * Initialize your data structure here.
     */
    public Solution232() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (!stack2.empty()) {
            return stack2.pop();
        } else {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (!stack2.empty()) {
            return stack2.peek();
        } else {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
            return stack2.peek();
        }
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return (stack1.empty() && stack2.empty());
    }
}
