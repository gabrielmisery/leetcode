public class test {
    public static void main(String[] args) {
        StackToQueue stackToQueue = new StackToQueue();
        stackToQueue.add(1);
        stackToQueue.add(2);
        stackToQueue.add(3);
        stackToQueue.add(4);
        stackToQueue.add(5);
        System.out.println(stackToQueue.poll());
        System.out.println(stackToQueue.peek());
        System.out.println(stackToQueue.poll());

    }
}
