package Tree;

import java.util.Stack;

public class Traversal {
    public void PreorderTraversal(TreeNode treeNode) {
        //递归
        if(treeNode ==null)
            return;
        System.out.print(treeNode.val);
        PreorderTraversal(treeNode.left);
        PreorderTraversal(treeNode.right);


    }
    public void PreorderTraversals(TreeNode treeNode){
        //非递归
        Stack<TreeNode> stack = new Stack<>();
        while (treeNode != null || !stack.isEmpty()) {
            if (treeNode != null) {
                System.out.print(treeNode.val);
                stack.push(treeNode);
                treeNode = treeNode.left;
            } else {
                TreeNode temp = stack.pop().right;
                treeNode = temp;
            }

        }
    }

    public void InOrderTraversal(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        InOrderTraversal(treeNode.left);
        System.out.print(treeNode.val);
        InOrderTraversal(treeNode.right);
    }

    public void PostOrderTraversal(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        PostOrderTraversal(treeNode.left);
        PostOrderTraversal(treeNode.right);
        System.out.print(treeNode.val);
    }
}
