/**
 * 删除排序数组中的重复项 II
 */
public class Solution80 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        int length = 1, temp = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == temp) {
                count++;
                if (count <= 2) {
                    nums[length] = nums[i];
                    length++;
                }
            } else {
                temp = nums[i];
                count = 1;
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
    }
}
