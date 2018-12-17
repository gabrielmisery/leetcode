public class Solution2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(8);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(1);
        System.out.print(addTwoNumbers(l1, l2));
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode real = answer;
        int carry = 0;
        int num1 = 0, num2 = 0;
        while (p != null || q != null) {
            if (p == null)
                num1 = 0;
            else
                num1 = p.val;
            if (q == null)
                num2 = 0;
            else
                num2 = q.val;
            real.next = new ListNode(carry + num1 + num2);
            carry = real.next.val / 10;
            real.next = new ListNode(real.next.val % 10);
            if (p != null) p = p.next;
            if (q != null) q = q.next;
            real = real.next;
        }
        if (carry != 0) {
            real.next = new ListNode(carry);
        }
        return answer.next;
    }
}
