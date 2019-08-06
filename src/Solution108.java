import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 将有序数组转换为二叉搜索树
 */
public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
            return null;
        int temp = nums.length / 2;
        TreeNode root = new TreeNode(nums[temp]);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(temp);
        arryToBST(queue, root, nums);
        return root;
    }

    public void arryToBST(Queue<Integer> queue, TreeNode root, int[] nums) {
        while (!queue.isEmpty()) {
            int temp = queue.poll();

            int[] numLeft;
            numLeft = Arrays.copyOfRange(nums, 0, temp);
            if (numLeft.length == 0)
                return;
            int lengthLeft = numLeft.length / 2;
            TreeNode left = new TreeNode(numLeft[lengthLeft]);
            root.left = left;
            Queue<Integer> queueLeft = new LinkedList<>();
            queueLeft.offer(lengthLeft);

            int[] numRight;
            numRight = Arrays.copyOfRange(nums, temp + 1, nums.length);
            if (numRight.length == 0)
                return;
            int lengthRight = numRight.length / 2;
            TreeNode right = new TreeNode(numRight[lengthRight]);
            root.right = right;
            Queue<Integer> queueRight = new LinkedList<>();
            queueRight.offer(lengthRight);

            arryToBST(queueLeft, left, numLeft);
            arryToBST(queueRight, right, numRight);
        }
    }
}
