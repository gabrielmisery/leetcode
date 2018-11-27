package SortingAlgorithm;

import java.util.Arrays;

/**
 * 计数排序
 */

public class CountingSort {
    public void sort(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int num1 : nums) {
            if (num1 > max)
                max = num1;
            if (num1 < min)
                min = num1;
        }
        int[] temp = new int[max+1];
        for (int num : nums) {
            temp[num]++;
        }
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0) {
                for (int j = 0; j < temp[i]; j++) {
                    nums[count] = i;
                    count++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10};
        CountingSort countingSort = new CountingSort();
        countingSort.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
