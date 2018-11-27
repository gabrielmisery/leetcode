/**
 * 字符串相乘
 */
public class Solution43 {
    public String multiply(String num1, String num2) {
        int[] result = new int[num1.length() + num2.length() + 1];
        String res = "";
        int resultLen = 0;
        for (int i = num1.length() - 1; i >= 0; i--) {
            resultLen++;
            int count = 0;
            int temp = 0;
            for (int j = num2.length() - 1; j >= 0; j--) {
                temp = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                result[resultLen + count] += temp % 10;
                result[resultLen + count + 1] += temp / 10;
                count++;
            }
        }
        for (int i = 1; i < result.length - 1; i++) {
            result[i + 1] += result[i] / 10;
            result[i] = result[i] % 10;
        }
        boolean flag = true;
        for (int i = result.length - 1; i >= 1; i--) {
            if (result[i] != 0)
                flag = false;
            if (flag)
                continue;
            res += Integer.toString(result[i]);
        }
        if (flag)
            return "0";

        return res;
    }

    public static void main(String[] args) {
        Solution43 solution43 = new Solution43();
        System.out.println(solution43.multiply("0", "0"));
    }
}
