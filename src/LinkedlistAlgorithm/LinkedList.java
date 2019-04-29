package LinkedlistAlgorithm;

public class LinkedList {
    public int val;
    public LinkedList next;

    public LinkedList(int x) {
        this.val = x;
    }

    public LinkedList reverseList() {
        LinkedList temp = this;
        LinkedList linkedListHead = null;
        LinkedList linkedListNext = null;
        while (temp != null) {
            linkedListNext = temp.next;
            temp.next = linkedListHead;
            linkedListHead = temp;
            temp = linkedListNext;
        }
        return linkedListHead;
    }


    public void printList() {
        LinkedList temp = this;
        while (temp != null) {
            System.out.print(temp.val);
            System.out.print(" ");
            temp = temp.next;
        }
        System.out.println("");

    }
}
