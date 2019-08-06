import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 */
public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        if(numRows == 0)
            return res;
        one.add(1);
        res.add(one);
        if (numRows == 1)
            return res;
        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j < i; j++) {
                int k = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                temp.add(k);
            }
            temp.add(1);
            res.add(temp);
        }
        return res;
    }
}
