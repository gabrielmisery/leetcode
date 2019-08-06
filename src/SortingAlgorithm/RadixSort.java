package SortingAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 基数排序
 * 时间复杂度 O(d(n+radix))
 * 稳定
 */

public class RadixSort {
    public void sort(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        int[] temp = Arrays.copyOf(nums, nums.length);
        int count = 0,base=10;
        while (max != 0) {
            max = max / 10;
            count++;
        }
        for (int i = 0; i < count; i++) {
            ArrayList<Integer>[] bucket = new ArrayList[10];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = temp[j] % base;
                if (bucket[temp[j]] == null) {
                    bucket[temp[j]] = new ArrayList<>();
                    bucket[temp[j]].add(nums[j]);
                } else {
                    bucket[temp[j]].add(nums[j]);
                }
            }
            int count1 = 0;
            for (ArrayList<Integer> aBucket : bucket) {
                if (aBucket != null) {
                    for (Integer integer : aBucket) {
                        nums[count1] = integer;
                        temp[count1] = integer / base;
                        count1++;
                    }
                }
            }
            base *= 10;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10};
        RadixSort radixSort = new RadixSort();
        radixSort.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
