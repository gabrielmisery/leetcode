/**
 * 在排序数组中查找元素的第一个和最后一个位置
 */
public class Solution34 {
    public static void main(String[] args) {
        int[] nums = new int[]{};
        searchRange(nums, 5);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        for (int i = 0, j = nums.length - 1; i <= j; i++, j--) {
            if (nums[i] == target) {
                result[0] = i;
                while (nums[i] == target) {
                    i++;
                    if (i == nums.length)
                        break;
                }
                result[1] = i - 1;
                break;
            }
            if (nums[j] == target) {
                result[1] = j;
                while (nums[j] == target) {
                    j--;
                    if (j < 0)
                        break;
                }
                result[0] = j + 1;
                break;
            }
        }
        return result;
    }
}
