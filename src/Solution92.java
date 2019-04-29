/**
 * 反转链表II
 */
public class Solution92 {
    ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode res = new ListNode(-1);
        ListNode temp = res;
        res.next = head;
        int i = 1;
        while (i < m) {
            head = head.next;
            res = res.next;
            i++;
        }
        ListNode next = null;
        while (i < n){
            next = head.next;
            head.next = next.next;
            next.next=res.next;
            res.next = next;
            i++;
        }
        return temp.next;
    }

}
