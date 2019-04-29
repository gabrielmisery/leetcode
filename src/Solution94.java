import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的中序遍历
 */
public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        backTrack(root, result);
        return result;
    }

    public void backTrack(TreeNode node, List<Integer> result) {
        if (node != null) {
            backTrack(node.left, result);
            result.add(node.val);
            backTrack(node.right, result);
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode child2 = new TreeNode(2);
        TreeNode child3 = new TreeNode(3);
        root.right = child2;
        child2.left = child3;
        Solution94 solution94 = new Solution94();
        solution94.inorderTraversal(root);
    }
}
