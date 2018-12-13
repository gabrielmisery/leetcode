import java.util.Arrays;

/**
 * 加一
 */
public class Solution66 {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length + 1];
        digits[digits.length - 1] += 1;
        int temp = 0;
        result[0] = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += temp;
            if (digits[i] >= 10) {
                temp = 1;
                digits[i] -= 10;
                result[i + 1] = digits[i];
            } else {
                temp = 0;
                result[i + 1] = digits[i];
                break;
            }
        }
        if (temp == 0) {
            return digits;
        } else {
            return result;
        }
    }

    public static void main(String[] args) {
        Solution66 solution66 = new Solution66();
        System.out.println(Arrays.toString(solution66.plusOne(new int[]{0})));
    }
}
