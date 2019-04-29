/**
 * 搜索旋转排序数组 II
 */
public class Solution81 {
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return false;
        int rotated = nums.length - 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                rotated = i;
                break;
            }
        }
        if (target > nums[rotated] || (rotated + 1 < nums.length && target < nums[rotated + 1]))
            return false;
        if (target < nums[0]) {
            for (int i = rotated + 1; i < nums.length; i++) {
                if (nums[i] == target)
                    return true;
                if (nums[i] > target)
                    return false;
            }
        } else {
            for (int i = 0; i <= rotated; i++) {
                if (nums[i] == target)
                    return true;
                if (nums[i] > target)
                    return false;
            }
        }
        return false;
    }
}
