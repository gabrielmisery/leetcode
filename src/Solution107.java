import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的层次遍历II
 */
public class Solution107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return res;
        queue.add(root);
        bottomTraversal(queue,res);
        return res;
    }

    public void bottomTraversal(Queue<TreeNode> queue, List<List<Integer>> res) {
        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> list = new ArrayList<>();
            while (n > 0) {
                TreeNode temp = queue.poll();
                list.add(temp.val);
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
                n--;
            }
            bottomTraversal(queue, res);
            res.add(list);
        }
    }

}
