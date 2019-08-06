import java.util.LinkedList;
import java.util.Queue;

/**
 * 平衡二叉树
 */
public class Solution110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (!isRight(temp)) {
                return false;
            }
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
        return true;
    }

    public boolean isRight(TreeNode treeNode) {
        int left = getDepth(treeNode.left, 1);
        int right = getDepth(treeNode.right, 1);
        return Math.abs(left - right) <= 1;
    }

    public int getDepth(TreeNode treeNode, int depth) {
        if (treeNode != null) {
            return Math.max(getDepth(treeNode.left, depth + 1), getDepth(treeNode.right, depth + 1));
        } else {
            return depth;
        }
    }
}
