import java.util.ArrayList;
import java.util.List;

public class Solution872 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(2);
        System.out.println(leafSimilar(root1, root2));
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> rootNode1 = new ArrayList<>();
        List<Integer> rootNode2 = new ArrayList<>();
        rootNode1 = findNode(root1, rootNode1);
        rootNode2 = findNode (root2, rootNode2);
        return rootNode1.equals(rootNode2);
    }

    public static List<Integer> findNode(TreeNode treeNode, List<Integer> list) {
        if (treeNode.left == null && treeNode.right == null) {
            list.add(treeNode.val);
            return list;
        }
        if (treeNode.left != null)
            findNode(treeNode.left, list);
        if (treeNode.right != null)
            findNode(treeNode.right, list);
        return list;
    }
}
