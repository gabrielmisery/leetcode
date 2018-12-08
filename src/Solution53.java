/**
 * 最大子序和
 */
public class Solution53 {
    public int maxSubArray(int[] nums) {
        int temp = 0, result = nums[0];
        for (int num : nums) {
            if (temp >= 0) {
                temp += num;
            } else {
                temp = num;
            }
            result = Math.max(result, temp);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution53 solution53 = new Solution53();
        System.out.println(solution53.maxSubArray(new int[]{-2, -1, -3, -4, -3, -2, -1, -5, -4}));
    }
}
