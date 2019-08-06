/**
 * 二叉树的最小深度
 */
public class Solution111 {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        return getDepth(root, 0);
    }

    public int getDepth(TreeNode treeNode, int depth) {
        if (treeNode != null) {
            if(treeNode.right == null)
                return getDepth(treeNode.left, depth + 1);
            else if(treeNode.left == null)
                return getDepth(treeNode.right, depth + 1);
            else
                return Math.min(getDepth(treeNode.left, depth + 1), getDepth(treeNode.right, depth + 1));
        } else {
            return depth;
        }
    }
}
