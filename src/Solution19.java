public class Solution19 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        listNode.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        removeNthFromEnd(listNode, 5);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode listNode = new ListNode(0);
        listNode.next = head;
        int length = 1;
        while (listNode.next != null) {
            length++;
            listNode = listNode.next;
        }
        listNode = head;
        for (int i = 1; i < length - n; i++) {
            listNode = listNode.next;
        }
//        if (listNode.next.next != null)
        listNode.next = listNode.next.next;
//        listNode = head;
        return listNode;
    }
}
