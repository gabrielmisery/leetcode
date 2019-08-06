/**
 * 环形链表
 * 快慢指针
 */
public class Solution141 {
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow)
                return true;
        }
        return false;
    }
}
