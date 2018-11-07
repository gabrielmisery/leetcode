import java.util.Arrays;

public class Solution31 {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 1};
        nextPermutation(nums);
    }

    public static void nextPermutation(int[] nums) {
        int sig = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                sig = i - 1;
                break;
            }
        }
        if (sig == -1) {
            int head = 0, tail = nums.length - 1;
            while (head <= tail) {
                int temp = nums[head];
                nums[head] = nums[tail];
                nums[tail] = temp;
                head++;
                tail--;
            }

        } else {
            for (int i = nums.length - 1; i > sig; i--) {
                if (nums[i] > nums[sig]) {
                    int temp = nums[i];
                    nums[i] = nums[sig];
                    nums[sig] = temp;
                    break;
                }
            }
            Arrays.sort(nums, sig + 1, nums.length);
        }
    }
}
