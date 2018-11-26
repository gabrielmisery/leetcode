package SortingAlgorithm;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort {
    public void sort(int[] nums, int head, int tail) {
        if (head >= tail || tail - head == 1)
            return;

        int div;
        if ((tail - head) % 2 == 0) {
            div = (tail - head) / 2;
        } else {
            div = (tail - head) / 2;
            div++;
        }
        sort(nums, head, head + div);
        sort(nums, head + div, tail);

        int temp = head;
        int[] temp1 = Arrays.copyOfRange(nums, head, head + div);
        int[] temp2 = Arrays.copyOfRange(nums, head + div, tail);
        int i = 0, j = 0;
        while (i < temp1.length && j < temp2.length) {
            if (temp1[i] < temp2[j]) {
                nums[temp] = temp1[i];
                i++;
            } else {
                nums[temp] = temp2[j];
                j++;
            }
            temp++;
        }
        if (i == temp1.length) {
            for (int m = temp; m < tail; m++, j++) {
                nums[m] = temp2[j];
            }
        } else if (j == temp2.length) {
            for (int m = temp; m < tail; m++, i++) {
                nums[m] = temp1[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(nums, 0, nums.length);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
