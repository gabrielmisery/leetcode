import java.util.ArrayList;
import java.util.List;

/**
 * 子集
 */
public class Solution78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        result.add(new ArrayList<>(temp));
        backTrack(result, new ArrayList<>(temp), nums.length, 0, nums);
        return result;
    }

    public void backTrack(List<List<Integer>> result, List<Integer> temp, int count, int start, int[] nums) {
        if (count == 0)
            return;
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            result.add(new ArrayList<>(temp));
            backTrack(result, new ArrayList<>(temp), nums.length - i - 1, i + 1, nums);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution78 solution78 = new Solution78();
        solution78.subsets(new int[]{1, 2});
    }
}
