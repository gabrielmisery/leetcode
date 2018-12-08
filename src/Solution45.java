/**
 * 跳跃游戏II
 */
public class Solution45 {

//        public int jump(int[] nums) {
//        if (nums.length == 1)
//            return 0;
//        if (nums[0] >= nums.length - 1)
//            return 1;
//        int tempResult = 0, result = nums.length - 1;
//        List<Integer> res = new ArrayList<>();
//        res.add(result);
//        for (int i = nums[0]; i > 0; i--) {
//            jump2(Arrays.copyOfRange(nums, i, nums.length), tempResult + 1, result, res);
//        }
//        return Collections.min(res);
//    }
//
//    public void jump2(int[] nums, int tempResult, int result, List<Integer> res) {
//        if (nums[0] >= nums.length - 1) {
//            tempResult++;
//            if (tempResult < result) {
//                result = tempResult;
//            }
//            res.add(result);
//            return;
//        }
//        for (int i = nums[0]; i > 0; i--) {
//            jump2(Arrays.copyOfRange(nums, i, nums.length), tempResult + 1, result, res);
//        }
//    }

    public int jump(int[] nums) {
        if (nums.length == 1)
            return 0;
        int i = 0, count = 0;
        while (i < nums.length) {
            int temp = 0;
            for (int j = 1; j <= nums[i]; j++) {
                if (i + j >= nums.length - 1) {
                    return ++count;
                }
                if (i + j + nums[j + i] >= temp + nums[temp])
                    temp = j + i;
            }
            count++;
            i = temp;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        Solution45 solution45 = new Solution45();
        System.out.println(solution45.jump(nums));
    }
}
