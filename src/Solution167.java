/**
 * 两数之和 II - 输入有序数组
 */
public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        res[0] = 0;
        res[1] = numbers.length - 1;
        while (numbers[res[0]] + numbers[res[1]] != target) {
            if (numbers[res[0]] + numbers[res[1]] > target) {
                res[1]--;
            } else {
                res[0]++;
            }
        }
        res[0]++;
        res[1]++;
        return res;
    }
}
