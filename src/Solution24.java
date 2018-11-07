public class Solution24 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        swapPairs(node1);
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode result = new ListNode(0);
        result.next = head;
        head = result;
        while (head.next != null && head.next.next != null) {
            ListNode temp1 = head.next;
            ListNode temp2 = head.next.next;
            head.next = temp2;
            temp1.next = temp2.next;
            temp2.next = temp1;
            head = head.next.next;
        }
        return result.next;
    }
}
