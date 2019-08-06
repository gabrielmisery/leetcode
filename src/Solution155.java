import java.util.Stack;

/**
 * 最小栈
 */
public class Solution155 {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    int min;

    public Solution155() {
        stack = new Stack<>();
        minStack = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        stack.push(x);
        if(!minStack.isEmpty())
            min = minStack.peek();
        else min = Integer.MAX_VALUE;
        if (min >= stack.peek()) {
            min = stack.peek();
            minStack.push(min);
        }
    }

    public void pop() {
        int x = stack.pop();
        if (x == minStack.peek())
            minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
