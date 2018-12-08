import java.util.ArrayList;
import java.util.List;

/**
 * 全排列
 */
public class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int num : nums) {
            List<Integer> temp = new ArrayList<>();
            temp.add(num);
            search(temp, nums, result);
        }
        return result;
    }

    public void search(List<Integer> temp, int[] nums,List<List<Integer>> result) {
        if(temp.size() == nums.length){
            List<Integer> destList=new ArrayList<>(temp);
            result.add(destList);
            return;
        }
        for (int num : nums) {
            if (!temp.contains(num)) {
                temp.add(num);
                search(temp, nums, result);
                temp.remove(temp.size() - 1);
            }

        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        Solution46 solution46 = new Solution46();
        solution46.permute(nums);
    }
}
