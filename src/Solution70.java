import java.util.ArrayList;
import java.util.List;

/**
 * 爬楼梯
 */
public class Solution70 {
    public int climbStairs(int n) {
        int temp = 2;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        while (temp < n) {
            list.add(list.get(temp - 1) + list.get(temp - 2));
            temp++;
        }
        return list.get(n - 1);
    }

    public static void main(String[] args) {
        Solution70 solution70 = new Solution70();
        System.out.println(solution70.climbStairs(2));
    }
}
