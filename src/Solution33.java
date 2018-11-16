/**
 * 搜索旋转排序数组
 */
public class Solution33 {

    public static void main(String[] args) {
        int[] nums = new int[]{1};
        System.out.println(search(nums, 1));
    }

    public static int search(int[] nums, int target) {
        int rotatedPoint = nums.length;
        if (nums.length == 0)
            return -1;
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i] < nums[i - 1]) {
                rotatedPoint = i;
                break;
            }
        }
        if (target < nums[0]) {
            for (int i = rotatedPoint; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
            return -1;
        } else {
            for (int i = 0; i < rotatedPoint; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
            return -1;
        }
    }
}
