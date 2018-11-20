import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *组合总和 II
 */
public class Solution40 {

    //    public List<Integer> sort(int[] candidates, int target) {
//        List list = new ArrayList<Integer>();
//        for (int i = 0; i < candidates.length; i++) {
//            if (candidates[i] <= target) {
//                list.add(candidates[i]);
//            }
//        }
//        return list;
//    }
//
//    public List<List<Integer>> combinationSum2(List<Integer> candidates, int target) {
//        List result = new ArrayList<List<Integer>>();
//        for (int i = 0; i < candidates.size(); i++) {
//            for (int j = 0; j < candidates.size(); j++) {
//                if (candidates.get(i) + candidates.get(j) == target && i != j) {
//                    List list = new ArrayList<Integer>();
//                    list.add(candidates.get(i), candidates.get(j));
//                    result.add(list);
//                }
//            }
//        }
//        return result;
//    }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
            findTarget(tempCandidates, target, result, tempResult, -1);
        } else {
            findTarget(candidates, target, result, tempResult, -1);
        }
        return result;

    }

    public boolean findTarget(int[] tempArray, int target, List<List<Integer>> result, List<Integer> tempResult, int index) {
        for (int i = index + 1; i < tempArray.length; i++) {
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
            if (i + 1 < tempArray.length)
                while (tempArray[i] == tempArray[i + 1]) {
                    i++;
                    if (i == tempArray.length - 1)
                        break;
                }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution40 solution40 = new Solution40();
        int[] candidates = new int[]{3, 1, 3, 5, 1, 1};
        List<List<Integer>> result = solution40.combinationSum2(candidates, 8);
        for (List<Integer> aResult : result) {
            System.out.println(aResult);
        }
    }
}
