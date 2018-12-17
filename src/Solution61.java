/**
 * 旋转链表
 */
public class Solution61 {

    //1
//    public ListNode rotateRight(ListNode head, int k) {
//        if(head == null)
//            return head;
//        ListNode listNode = head;
//        int count = 0;
//        while (listNode != null) {
//            listNode = listNode.next;
//            count++;
//        }
//        ListNode[] listNodes = new ListNode[count];
//        k = k % count;
//        int count1 = 0;
//        listNode = head;
//        while (listNode != null) {
//            listNodes[(count1 + k) % count] = new ListNode(listNode.val);
//            count1++;
//            listNode = listNode.next;
//        }
//        for (int i = 0;i<listNodes.length-1;){
//            listNodes[i].next = listNodes[++i];
//        }
//        return listNodes[0];
//    }


    //2
    //将链表头尾链接，然后选取位置截断
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return head;
        ListNode listNode = head;
        int count = 1;
        while (listNode.next != null) {
            listNode = listNode.next;
            count++;
        }
        k = count - (k % count);
        ListNode tail = listNode;
        listNode.next = head;
        listNode = head;
        while (k-- > 0) {
            listNode = listNode.next;
            tail = tail.next;
        }
        tail.next = null;
        return listNode;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        Solution61 solution61 = new Solution61();
        solution61.rotateRight(listNode1, 111);
    }
}
