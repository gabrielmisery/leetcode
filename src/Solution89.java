import java.util.ArrayList;
import java.util.List;

/**
 * 格雷编码
 */
public class Solution89 {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        int[] temp = new int[n];
        backTrack(result, temp, 0, 0);
        return result;
    }

    public void backTrack(List<Integer> result, int[] temp, int val, int start) {
        for (int i = start; i < temp.length; i++) {
            if (temp[i] + 1 < 2) {
                temp[i] += 1;
                int tempVal = (int) Math.pow(2, i);
                result.add(val + tempVal);
                backTrack(result, temp, val + tempVal, i);
            } else {
                continue;
            }
            temp[i] -= 1;
        }
    }
}
