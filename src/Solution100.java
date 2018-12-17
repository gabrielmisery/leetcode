/**
 * 相同的树
 */
public class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q != null)
            return false;
        if (p != null && q == null)
            return false;
        if (p == null)
            return true;
        if (p.val == q.val) {
            if (!isSameTree(p.left, q.left)) {
                return false;
            }
            return isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }
}
