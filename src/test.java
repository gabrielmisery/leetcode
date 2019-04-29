import Tree.Traversal;
import Tree.TreeNode;

import java.util.List;

public class test {
    public static void main(String[] args) {
//         队列实现栈
//        StackToQueue stackToQueue = new StackToQueue();
//        stackToQueue.add(1);
//        stackToQueue.add(2);
//        stackToQueue.add(3);
//        stackToQueue.add(4);
//        stackToQueue.add(5);
//        System.out.println(stackToQueue.poll());
//        System.out.println(stackToQueue.peek());
//        System.out.println(stackToQueue.poll());

//        链表
//        LinkedList one = new LinkedList(1);
//        LinkedList two = new LinkedList(2);
//        LinkedList three = new LinkedList(3);
//        LinkedList four = new LinkedList(4);
//        LinkedList five = new LinkedList(5);
//        one.next = two;
//        two.next = three;
//        three.next = four;
//        four.next = five;
//        one.printList();
//        LinkedList newOne = one.reverseList();
//        newOne.printList();

//        TreeNode parent = new TreeNode(1);
//        TreeNode childl1 = new TreeNode(2);
//        TreeNode childr1 = new TreeNode(3);
//        TreeNode childl2 = new TreeNode(4);
//        TreeNode childr2 = new TreeNode(5);
//        TreeNode childl3 = new TreeNode(6);
//        TreeNode childr3 = new TreeNode(7);
//         二叉树
//        parent.left = childl1;
//        parent.right = childr1;
//        childl1.left = childl2;
//        childl1.right = childr2;
//        childl2.left = childl3;
//        childl2.right = childr3;
//        Traversal traversal = new Traversal();
//        traversal.PreorderTraversal(parent);
//        traversal.InOrderTraversal(parent);
//        traversal.PostOrderTraversal(parent);

//        Solution93 solution93 = new Solution93();
//        System.out.print(solution93.restoreIpAddresses("0000"));

//        ListNode one = new ListNode(1);
//        ListNode two = new ListNode(2);
//        ListNode three = new ListNode(3);
//        ListNode four = new ListNode(4);
//        ListNode five = new ListNode(5);
//        one.next = two;
//        two.next = three;
//        three.next = four;
//        four.next = five;

//        Solution92 solution92 = new Solution92();
//        solution92.reverseBetween(one, 1, 5);

//        Solution91 solution91 = new Solution91();
//        System.out.print(solution91.numDecodings("29"));

        Solution90 solution90 = new Solution90();
        int[] nums = new int[]{1,2,2};
//        List<List<Integer>> res = solution90.subsetsWithDup(nums);
        System.out.print(solution90.subsetsWithDup(nums));
    }
}
