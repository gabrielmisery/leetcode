/**
 * 打家劫舍
 */
public class Solution198 {
    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        boolean[] visited = new boolean[nums.length];
        update(nums, 0, visited);
        return Math.max(nums[0], nums[1]);
    }

    public void update(int[] nums, int index, boolean[] visited) {
        if (visited[index])
            return;
        visited[index] = true;
        int count = 0;
        if (index + 1 < nums.length) {
            count++;
            update(nums, index + 1, visited);
        }
        if (index + 2 < nums.length) {
            count++;
            update(nums, index + 2, visited);
        }
        if (index + 3 < nums.length) {
            count++;
            update(nums, index + 3, visited);
        }
        switch (count) {
            case 2: {
                nums[index] += nums[index + 2];
                break;
            }
            case 3: {
                nums[index] += Math.max(nums[index + 2], nums[index + 3]);
                break;
            }
        }
    }
}
