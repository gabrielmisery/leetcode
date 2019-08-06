/**
 * 反转链表
 */
public class Solution206 {
    public ListNode reverseList(ListNode head) {
//        if (head == null)
//            return null;
//        ListNode newHead = new ListNode(-1);
//        newHead.next = head;
//        ListNode next = head.next;
//        ListNode temp;
//        while (next != null) {
//            temp = newHead.next;
//            head.next = next.next;
//            newHead.next = next;
//            next.next = temp;
//            next = head.next;
//        }
//        return newHead.next;
        ListNode cur = head;
        ListNode newHead = null;
        while (cur!=null){
            ListNode temp = cur.next;
            cur.next = newHead;
            newHead = cur;
            cur = temp;
        }
        return newHead;
    }
}
