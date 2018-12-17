/**
 * 删除排序链表中的重复元素 II
 */
public class Solution82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode result = res;
        while (head != null) {
            int temp = head.val;
            if (head.next != null && head.next.val == temp) {
                head = head.next;
                while (head != null && head.val == temp) {
                    head = head.next;
                    res.next = head;
                }
            } else {
                head = head.next;
                res = res.next;
            }
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(5);
//        ListNode node8 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
//        node7.next = node8;
        Solution82 solution82 = new Solution82();
        solution82.deleteDuplicates(node1);
    }
}
