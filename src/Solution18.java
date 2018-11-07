import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution18 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 0, 0, 0};
        System.out.println(fourSum(nums, 1));

    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = nums.length - 1; j > 2; j--) {
                int head = i + 1, tail = j - 1;
                while (head < tail) {
                    if (nums[i] + nums[j] + nums[head] + nums[tail] == target) {
                        List<Integer> tempResult = new ArrayList<>();
                        tempResult.add(nums[i]);
                        tempResult.add(nums[j]);
                        tempResult.add(nums[head]);
                        tempResult.add(nums[tail]);
                        result.add(tempResult);
                        int temp1 = head;
                        head++;
                        while (nums[temp1] == nums[head] && head < tail)
                            head++;
                        while (nums[tail - 1] == nums[tail] && head < tail)
                            tail--;

                    } else if (nums[i] + nums[j] + nums[head] + nums[tail] > target) {
                        tail--;
                    } else {
                        head++;
                    }
                }
                while (nums[j] == nums[j - 1] && j > 2)
                    j--;
            }
            while (nums[i] == nums[i + 1] && i < nums.length - 3)
                i++;
        }

        return result;
    }
}
