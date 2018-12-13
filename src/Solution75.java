import java.util.Arrays;

/**
 * 颜色分类
 */
public class Solution75 {

//    public void sortColors(int[] nums) {
//        int head = 0, tail = nums.length - 1;
//        while (head < tail) {
//            if (nums[tail] < nums[head]) {
//                int temp = nums[tail];
//                nums[tail] = nums[head];
//                nums[head] = temp;
//                if (nums[head] == 1 && nums[tail] == 2) {
//                    tail--;
//                } else {
//                    head++;
//                }
//            } else if (nums[tail] == nums[head]) {
//                switch (nums[tail]) {
//                    case 0: {
//                        head++;
//                        break;
//                    }
//                    case 2: {
//                        tail--;
//                        break;
//                    }
//                    case 1: {
//                        int i = tail;
//                        boolean flag = false;
//                        while (i > head) {
//                            if (nums[i] != 1) {
//                                flag = true;
//                                int temp = nums[i];
//                                nums[i] = nums[tail];
//                                nums[tail] = temp;
//                            }
//                            i--;
//                        }
//                        if (!flag) {
//                            head = tail;
//                        }
//                        break;
//                    }
//                }
//            }else {
//                if (nums[head] == 1 && nums[tail] == 2) {
//                    tail--;
//                } else {
//                    head++;
//                }
//            }
//        }
//    }

    public void sortColors(int[] nums) {
        int head = 0, tail = nums.length - 1;
        int i = 0;
        while (i <= tail) {
            if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[tail];
                nums[tail] = temp;
                tail--;
            } else if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[head];
                nums[head] = temp;
                head++;
                i++;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Solution75 solution75 = new Solution75();
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        solution75.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
