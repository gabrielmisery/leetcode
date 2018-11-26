package SortingAlgorithm;

/**
 * 插入排序
 */

public class InsertSort {

    public void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = i - 1;
            int temp = nums[i];
            while (j >= 0 && temp < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = temp;
        }
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10};
        InsertSort insertSort = new InsertSort();
        insertSort.sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
