/**
 * 二叉树的最大深度
 */
public class Solution104 {
    public int maxDepth(TreeNode root) {
        return traversal(root, 0);
    }

    public int traversal(TreeNode treeNode, int depth) {
        if (treeNode != null) {
            return Math.max(traversal(treeNode.left, depth + 1), traversal(treeNode.right, depth + 1));
        }else {
            return depth;
        }
    }
}

