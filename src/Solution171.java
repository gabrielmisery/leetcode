/**
 * Excel表列序号
 */
public class Solution171 {
    public int titleToNumber(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int temp = (int) s.charAt(i) - 'A' + 1;
            res += Math.pow(26, (s.length() - i - 1)) * temp;
        }
        return res;
    }
}
