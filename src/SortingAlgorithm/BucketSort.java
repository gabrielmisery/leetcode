package SortingAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 桶排序
 */
public class BucketSort {
    public void sort(int[] nums, int size) {
        int max = nums[0], min = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        int gap = (max - min) / size;
        ArrayList<Integer>[] bucket = new ArrayList[size + 1];
        //ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        for (int num : nums) {
            int k = num / gap;
            if (bucket[k] == null) {
                bucket[k] = new ArrayList<>();
                bucket[k].add(num);
            } else {
                bucket[k].add(num);
                for (int j = bucket[k].size() - 1; j >= 0; j--) {
                    if (num < bucket[k].get(j)) {
                        bucket[k].set(j + 1, bucket[k].get(j));
                        bucket[k].set(j, num);
                    }
                }
            }
        }
        int count = 0;
        for (ArrayList<Integer> aBucket : bucket) {
            if (aBucket != null) {
                for (Integer integer : aBucket) {
                    nums[count] = integer;
                    count++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10};
        BucketSort bucketSort = new BucketSort();
        bucketSort.sort(nums, 5);
        System.out.println(Arrays.toString(nums));
    }
}
