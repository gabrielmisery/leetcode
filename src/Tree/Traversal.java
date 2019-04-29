package Tree;

public class Traversal {
    public void PreorderTraversal(TreeNode treeNode){
        if(treeNode ==null)
            return;
        System.out.print(treeNode.val);
        PreorderTraversal(treeNode.left);
        PreorderTraversal(treeNode.right);
    }
    public void InOrderTraversal(TreeNode treeNode){
        if(treeNode ==null){
            return;
        }

        InOrderTraversal(treeNode.left);
        System.out.print(treeNode.val);
        InOrderTraversal(treeNode.right);
    }
    public void PostOrderTraversal(TreeNode treeNode){
        if(treeNode ==null){
            return;
        }
        PostOrderTraversal(treeNode.left);
        PostOrderTraversal(treeNode.right);
        System.out.print(treeNode.val);
    }
}
