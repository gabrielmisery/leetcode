import java.util.*;

/**
 * 全排列 II
 */
public class Solution47 {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        Backtrack(nums, new ArrayList<>(), new ArrayList<>(), result);
        return new ArrayList<>(result);
    }

    public void Backtrack(int[] nums, List<Integer> record, List<Integer> temp, List<List<Integer>> result) {
        if (temp.size() == nums.length) {
            result.add(temp);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (record.contains(i)) continue;
            if (i > 0 && nums[i] == nums[i - 1] && record.contains(i - 1))
                continue;
            temp.add(nums[i]);
            record.add(i);
            Backtrack(nums, record, new ArrayList<>(temp), result);
            temp.remove(temp.size() - 1);
            record.remove(record.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2,2};
        Solution47 solution47 = new Solution47();
        solution47.permuteUnique(nums);
    }
}
