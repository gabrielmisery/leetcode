package SortingAlgorithm;

/**
 * 选择排序
 * 时间复杂度 O(n^2)
 * 不稳定
 */
public class SelectSort {
    public void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = Integer.MAX_VALUE;
            int pos = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < temp) {
                    temp = nums[j];
                    pos = j;
                }
            }
            nums[pos] = nums[i];
            nums[i] = temp;
        }

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10};
        SelectSort selectSort = new SelectSort();
        selectSort.sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
