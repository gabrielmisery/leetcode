import java.util.*;

public class Solution23 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(5);
        listNode.next = node2;
        node2.next = node3;

        ListNode listNode2 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        listNode2.next = node4;
        node4.next = node5;

        ListNode listNode3 = new ListNode(2);
        ListNode node6 = new ListNode(6);
        listNode3.next = node6;
        ListNode[] lists = new ListNode[]{listNode, listNode2, listNode3};
        mergeKLists(lists);

    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        ListNode result = head;
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            while (lists[i] != null) {
                temp.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        Collections.sort(temp);
        for (int i = 0; i < temp.size(); i++) {
            head.next = new ListNode(temp.get(i));
            head = head.next;
        }
        return result.next;
    }

}
