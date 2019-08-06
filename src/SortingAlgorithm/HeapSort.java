package SortingAlgorithm;


/**
 * 堆排序
 * 时间复杂度 O(nlogN)
 * 不稳定
 */
public class HeapSort {
    public void makeMaxHeap(int[] nums, int index, int length) {
        //右节点
        if (2 * index + 2 < length) {
            makeMaxHeap(nums, 2 * index + 2, length);
            if (nums[index] < nums[2 * index + 2]) {
                swapNode(nums, index, 2 * index + 2);

            }
            makeMaxHeap(nums, 2 * index + 2, length);
        }
        //左节点
        if (2 * index + 1 < length) {
            makeMaxHeap(nums, 2 * index + 1, length);
            if (nums[index] < nums[2 * index + 1]) {
                swapNode(nums, index, 2 * index + 1);
            }
            makeMaxHeap(nums, 2 * index + 1, length);
        }
    }

    public void swapNode(int[] nums, int index, int length) {
        int temp = nums[index];
        nums[index] = nums[length];
        nums[length] = temp;
    }

    public void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            makeMaxHeap(nums, 0, nums.length - i);
            swapNode(nums, 0, nums.length - i - 1);
        }
    }


    public static void main(String[] args) {
        int[] nums = new int[]{
                1,
                1, 4,
                8, 2, 55, 3,
                4, 8, 6, 4, 0, 11, 34, 90,
                23, 54, 77, 9, 2, 9, 4, 10};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
