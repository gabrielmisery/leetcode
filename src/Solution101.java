import java.util.ArrayList;
import java.util.Arrays;

/**
 * 对称二叉树
 */
public class Solution101 {
    ArrayList<Integer> left = new ArrayList<>();
    ArrayList<Integer> right = new ArrayList<>();

    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        leftTraversal(root.left);
        rightTraversal(root.right);
        return Arrays.equals(new ArrayList[]{left}, new ArrayList[]{right});
    }

    public void leftTraversal(TreeNode leftNode) {
        if (leftNode == null) {
            left.add(null);
            return;
        }
        left.add(leftNode.val);
        leftTraversal(leftNode.left);
        leftTraversal(leftNode.right);
    }

    public void rightTraversal(TreeNode rightNode) {
        if (rightNode == null) {
            right.add(null);
            return;
        }
        right.add(rightNode.val);
        rightTraversal(rightNode.right);
        rightTraversal(rightNode.left);
    }
}
