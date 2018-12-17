import java.util.ArrayList;
import java.util.List;

/**
 * 组合
 */
public class Solution77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(n, k, 1, new ArrayList<>(), result);
        return result;
    }

    public void backTrack(int n, int k, int start, List<Integer> temp, List<List<Integer>> result) {
        if (temp.size() == k) {
            result.add(temp);
            return;
        }
        for (int i = start; i <= (n - k + temp.size() + 1); i++) {
            temp.add(i);
            backTrack(n, k, i + 1, new ArrayList<>(temp), result);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution77 solution77 = new Solution77();
        solution77.combine(4, 2);
    }
}
