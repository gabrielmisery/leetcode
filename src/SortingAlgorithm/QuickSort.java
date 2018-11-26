package SortingAlgorithm;

/**
 * 快速排序
 */
public class QuickSort {
    public void sort(int[] nums, int head, int tail) {
        if (head >= tail || nums == null || nums.length <= 1) {
            return;
        }
        int temp = nums[head];
        int count = head + 1;
        for (int i = head + 1; i < tail; i++) {
            if (nums[i] <= temp) {
                int j = i;
                while (j >= count) {
                    int temp2 = nums[j];
                    nums[j] = nums[--j];
                    nums[j] = temp2;
                }
                count++;
            }
        }
        sort(nums, head, count - 1);
        sort(nums, count, tail);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(nums, 0, nums.length);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
