import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 只出现一次的数字
 * 异或运算
 */
public class Solution136 {
    public int singleNumber(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length;i++) {
            temp ^= nums[i];
        }
        return temp;
    }
}
