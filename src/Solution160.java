/**
 * 相交链表
 */
public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 1, lengthB = 1;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (tempA != null) {
            tempA = tempA.next;
            lengthA++;
        }
        while (tempB != null) {
            tempB = tempB.next;
            lengthB++;
        }
        int dis;
        ListNode longer, shorter;
        if (lengthA > lengthB) {
            longer = headA;
            shorter = headB;
            dis = lengthA - lengthB;
        } else {
            longer = headB;
            shorter = headA;
            dis = lengthB - lengthA;
        }
        while (dis > 0) {
            longer = longer.next;
            dis--;
        }
        while (longer != null) {
            if (longer == shorter) {
                if (isSame(longer, shorter)) {
                    return longer;
                }
            }
            longer = longer.next;
            shorter = shorter.next;
        }
        return null;
    }

    public boolean isSame(ListNode a, ListNode b) {
        while (a != null) {
            if (a != b)
                return false;
            a = a.next;
            b = b.next;
        }
        return true;
    }
}
