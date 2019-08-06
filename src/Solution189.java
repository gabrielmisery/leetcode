/**
 * 旋转数组
 */
public class Solution189 {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        boolean[] visited = new boolean[length];
        for (int i = 0; i < length; i++) {
            int temp = nums[i], index = i;
            while (true) {
                int index2;
                if (index + k > length - 1) {
                    index2 = (index + k) % length;
                } else {
                    index2 = index + k;
                }
                if (visited[index2]) {
                    break;
                }
                int temp1 = nums[index2];
                nums[index2] = temp;
                temp = temp1;
                visited[index2] = true;
                index = index2;
            }
        }
    }
}
