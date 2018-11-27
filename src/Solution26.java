public class Solution26 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 5};
        removeDuplicates(nums);

    }

    public static int removeDuplicates(int[] nums) {

//        //双指针
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (j == 0) {
//                nums[j] = nums[i];
//                j++;
//            } else {
//                if (nums[j - 1] != nums[i]) {
//                    nums[j] = nums[i];
//                    j++;
//                }
//            }
//        }
//
//        return j;

        //单指针
        //亲爱的别任性 你的眼睛 再说我愿意
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                count++;
            } else {
                nums[count] = nums[i];
                count++;
            }
            if (i < nums.length - 1)
                while (nums[i] == nums[i + 1] && i < nums.length - 1) {
                    i++;
                }
        }
        return count;
    }
}
