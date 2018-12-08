/**
 * 排序链表
 */

public class Solution148 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


//        public ListNode sortList(ListNode head) {
//        if(head == null)
//            return head;
//        ListNode temp = head;
//        ListNode listNode = head;
//        while (temp.next !=null){
//            head = temp;
//            while (head!=null){
//                if (head.val <= temp.val){
//                    int temp1 = head.val;
//                    head.val = temp.val;
//                    temp.val = temp1;
//                }
//                head = head.next;
//            }
//            temp = temp.next;
//        }
//
//        return listNode;
//    }

    public ListNode sortList(ListNode head) {
        ListNode tempNode = head;
        while (tempNode != null && tempNode.next != null) {
            if (tempNode.val > tempNode.next.val) {
                int temp = tempNode.next.val;
                tempNode.next.val = tempNode.val;
                tempNode.val = temp;
            }
            tempNode = tempNode.next.next;
        }
        int radix = 2;
        boolean flag = true;
        while (flag) {
            ListNode node = new ListNode(0);
            int temp = radix;
            tempNode = head;
            ListNode nodeHead = tempNode;
            while (tempNode != null && temp > 0) {
                tempNode = tempNode.next;
                temp--;
            }
            if (tempNode == null)
                flag = false;
            ListNode nodeTail = tempNode;
            mergeSortList(nodeHead, nodeTail, node, radix);
            radix = radix * 2;
            head = node.next;
        }
        return head;
    }

    public void mergeSortList(ListNode nodeHead, ListNode nodeTail, ListNode node, int radix) {
        int temp1 = 0, temp2 = 0;
        while (nodeHead != null && nodeTail != null && temp1 < radix && temp2 < radix) {
            if (nodeHead.val > nodeTail.val) {
                node.next = new ListNode(nodeTail.val);
                nodeTail = nodeTail.next;
                temp2++;
            } else {
                node.next = new ListNode(nodeHead.val);
                nodeHead = nodeHead.next;
                temp1++;
            }
            node = node.next;
        }
        if (temp1 == radix) {
            while (nodeTail !=null && temp2 < radix){
                node.next = new ListNode(nodeTail.val);
                nodeTail = nodeTail.next;
                node = node.next;
                temp2++;
            }
        } else {
            while (nodeHead != null && temp1 < radix){
                node.next = new ListNode(nodeHead.val);
                nodeHead = nodeHead.next;
                node = node.next;
                temp1++;
            }
        }
        int temp = radix;
        if(nodeTail == null || nodeHead ==null)
            return;
        while (temp > 0){
            if(nodeHead!= null)
                nodeHead = nodeHead.next;
            if(nodeTail!= null)
                nodeTail = nodeTail.next;
            temp--;
        }
        mergeSortList(nodeHead,nodeTail,node,radix);
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(19);
        ListNode node3 = new ListNode(14);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(-3);
        ListNode node6 = new ListNode(1);
        ListNode node7 = new ListNode(8);
        ListNode node8 = new ListNode(5);
        ListNode node9 = new ListNode(11);
        ListNode node10 = new ListNode(15);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next=node6;
        node6.next=node7;
        node7.next=node8;
        node8.next=node9;
        node9.next=node10;
        Solution148 solution148 = new Solution148();
        solution148.sortList(node1);
    }

}
