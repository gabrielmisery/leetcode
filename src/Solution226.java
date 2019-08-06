/**
 * 翻转二叉树
 */
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if(root!=null){
            TreeNode temp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(temp);
        }
        return root;
    }

}
