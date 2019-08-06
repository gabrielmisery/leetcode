/**
 * 回文链表
 */
public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        ListNode tmp = head;
        int count = 0;
        while (tmp != null) {
            tmp = tmp.next;
            count++;
        }
        if (count % 2 == 0) {
            count = count / 2;
        } else {
            count = (count / 2) + 1;
        }
        tmp = head;
        reverse(tmp, count);
        int i = 0;
        while (i < count) {
            tmp = tmp.next;
            i++;
        }
        while (tmp != null) {
            if (head.val != tmp.val)
                return false;
            head = head.next;
            tmp = tmp.next;
        }
        return true;
    }

    public void reverse(ListNode tmp, int start) {
        int i = 0;
        while (i < start - 1) {
            tmp = tmp.next;
            i++;
        }
        ListNode newNode = tmp.next;
        ListNode nextNode = newNode.next;
        ListNode tmpNode = tmp.next;
        while (nextNode != null) {
            newNode.next = nextNode.next;
            nextNode.next = tmpNode;
            tmpNode = nextNode;
            nextNode = newNode.next;
        }
        tmp.next = tmpNode;
    }

}
