import java.util.ArrayList;
import java.util.List;

public class Solution25 {
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
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        reverseKGroup(node1, 5);
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode test = head;
        for (int i = 0; i < k; i++) {
            if (test == null)
                return head;
            test = test.next;
        }
        ListNode result = new ListNode(0);
        result.next = head;
        head = result;

        while (head.next != null) {
            List<ListNode> tempList = new ArrayList<>();
            ListNode listNode = head;
            for (int i = 0; i < k; i++) {
                if (listNode.next != null) {
                    tempList.add(listNode.next);
                    listNode = listNode.next;
                } else {
                    return result.next;
                }
            }
            for (int i = tempList.size() - 1; i >= 0; i--) {
                if (i == tempList.size() - 1)
                    head.next = tempList.get(i);
                else {
                    tempList.get(i).next = head.next;
                    head.next = tempList.get(i);
                }
                head = head.next;
            }
        }
        return result.next;
    }
}
