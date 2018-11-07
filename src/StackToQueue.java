
class StackToQueue {
    //    private Stack<Integer> stack1 = new Stack<>();
//    private Stack<Integer> stack2 = new Stack<>();
    private MyStack stack1 = new MyStack();
    private MyStack stack2 = new MyStack();

    void add(int element) {
        stack1.push(element);
    }

    int poll() {
        if (stack2.empty()) {
            while (!stack1.empty())
                stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    int peek() {
        int temp = poll();
        stack2.push(temp);
        return temp;
    }
}
