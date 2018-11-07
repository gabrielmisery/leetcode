public class Solution21 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        listNode1.next = node2;
        node2.next = node3;
        ListNode listNode2 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        listNode2.next = node4;
        node4.next = node5;
        mergeTwoLists(listNode1, listNode2);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(1);
        ListNode head = result;
        while (l1 != null && l2 != null) {
            ListNode temp;
            if (l1.val <= l2.val) {
                temp = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                temp = new ListNode(l2.val);
                l2 = l2.next;
            }
            result.next = temp;
            result = result.next;
        }
        if (l1 == null) {
            result.next = l2;
        } else {
            result.next = l1;
        }
        return head.next;
    }
}
