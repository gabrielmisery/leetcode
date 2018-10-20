import java.util.Arrays;

public class Solution16 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1};
        System.out.println(threeSumClosest(nums, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int tempResult = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int head = i + 1;
            int tail = nums.length - 1;
            while (head < tail) {
                if (Math.abs(nums[i] + nums[head] + nums[tail] - target) <= Math.abs(tempResult - target)) {
                    tempResult = nums[i] + nums[head] + nums[tail];
                }
                if (nums[i] + nums[head] + nums[tail] > target) {
                    tail--;
                } else
                    head++;
            }
        }
        return tempResult;
    }
}
