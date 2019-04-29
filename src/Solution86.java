/**
 * 分隔链表
 */
public class Solution86 {
    public ListNode partition(ListNode head, int x) {
        ListNode first = new ListNode(0);
        ListNode max = new ListNode(0);
        ListNode tail = max;
        ListNode result = first;
        while (head != null) {
            if (head.val < x) {
                first.next = new ListNode(head.val);
                first = first.next;
            } else {
                max.next = new ListNode(head.val);
                max = max.next;
            }
            head = head.next;
        }
        first.next = tail.next;
        return result.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(2);
//        ListNode node7 = new ListNode(5);
//        ListNode node8 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
//        node6.next = node7;
//        node7.next = node8;
        Solution86 solution86 = new Solution86();
        solution86.partition(node1, 3);
    }
}
