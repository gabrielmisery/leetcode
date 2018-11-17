/**
 * 搜索插入位置
 */
public class Solution35 {
    public static void main(String[] args) {
        int[] nums = new int[]{};
        System.out.println(searchInsert(nums, 7));
    }

    private static int searchInsert(int[] nums, int target) {
        if (nums.length == 0)
            return 0;
        if (nums[0] > target)
            return 0;
        if (nums[nums.length - 1] < target)
            return nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
            else if (nums[i] < target && nums[i + 1] > target)
                return i + 1;
        }
        return 0;
    }
}
