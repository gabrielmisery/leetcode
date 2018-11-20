/**
 * 删除链表中的节点
 */
public class Solution237 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode('4');
        ListNode node1 = new ListNode('5');
        ListNode node2 = new ListNode('1');
        ListNode node3 = new ListNode('9');
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        Solution237 solution237 = new Solution237();
        solution237.deleteNode(node2);

    }
}
