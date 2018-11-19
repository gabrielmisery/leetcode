import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 组合总和
 */

public class Solution39 {
    private List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempResult = new ArrayList<>();
        Arrays.sort(candidates);
        if (candidates[candidates.length - 1] > target) {
            int i = candidates.length - 1;
            for (; i >= 0; i--) {
                if (candidates[i] <= target) {
                    break;
                }
            }
            int[] tempCandidates = Arrays.copyOfRange(candidates, 0, i + 1);
            findTarget(tempCandidates, target, result, tempResult, 0);
        } else {
            findTarget(candidates, target, result, tempResult, 0);
        }
        return result;
    }

    public boolean findTarget(int[] tempArray, int target, List<List<Integer>> result, List<Integer> tempResult, int index) {
        for (int i = index; i < tempArray.length; i++) {
            if (target - tempArray[i] < 0) {
                return false;
            } else {
                tempResult.add(tempArray[i]);
                if (target - tempArray[i] == 0) {
                    List<Integer> tempA = new ArrayList<>(tempResult);
                    result.add(tempA);
                    tempResult.remove(tempResult.size() - 1);
                } else {
                    if (!findTarget(tempArray, target - tempArray[i], result, tempResult, i)) {
                        if (!tempResult.isEmpty()) {
                            tempResult.remove(tempResult.size() - 1);
                        }
                    }
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] candidates = new int[]{2, 3, 5};
        Solution39 solution39 = new Solution39();
        List<List<Integer>> result = solution39.combinationSum(candidates, 8);
        for (List<Integer> aResult : result) {
            System.out.println(aResult);
        }
    }
}
