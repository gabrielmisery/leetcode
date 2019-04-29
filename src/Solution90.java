import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 子集II
 */
public class Solution90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        res.add(temp);
        backTrack(res, new ArrayList<>(temp), 0, nums);
        return res;
    }

    public void backTrack(List<List<Integer>> res, List<Integer> temp, int start, int[] nums) {
        for (int i = start; i < nums.length; i++) {
            if (i != start && nums[i] == nums[i - 1]) {
                continue;
            }
            temp.add(nums[i]);
            res.add(new ArrayList<>(temp));
            backTrack(res, new ArrayList<>(temp), i + 1, nums);
            temp.remove(temp.size() - 1);
        }
    }
}
