/**
 * 跳跃游戏（贪心算法）
 */
public class Solution55 {
    public boolean canJump(int[] nums) {
        if (nums.length == 1)
            return true;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 0)
                return false;
            int temp = 0;
            for (int j = 1; j <= nums[i]; j++) {
                if (i + j >= nums.length - 1)
                    return true;
                if (i + j + nums[j + i] >= temp + nums[temp])
                    temp = j + i;
            }
            i = temp;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution55 solution55 = new Solution55();
        System.out.println(solution55.canJump(new int[]{2,0,0,1}));
    }
}
