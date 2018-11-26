package SortingAlgorithm;

/**
 * 冒泡排序
 */

public class BubbleSort {
    public void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
