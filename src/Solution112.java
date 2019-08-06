/**
 * 路径总和
 */
public class Solution112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null)
            return root.val == sum;
        else {
            if (hasPathSum(root.left, sum - root.val))
                return true;
            return hasPathSum(root.right, sum - root.val);
        }
    }
}
