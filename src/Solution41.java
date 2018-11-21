import java.util.Arrays;

/**
 * 缺失的第一个正数
 */

public class Solution41 {
    public int firstMissingPositive(int[] nums) {
        if (nums.length == 0)
            return 1;
        Arrays.sort(nums);
        int result = 1;
        boolean[] temp = new boolean[nums[nums.length - 1] + 2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0)
                temp[nums[i]] = true;
        }
        for (int i = 1; i < temp.length; i++) {
            if (!temp[i]) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution41 solution41 = new Solution41();
        int[] nums = new int[]{1, 2, 0};
        System.out.println(solution41.firstMissingPositive(nums));
    }
}
