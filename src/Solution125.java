/**
 * 验证回文串
 */
public class Solution125 {
    public boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            while (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
                if (start > end)
                    return true;
            }
            while (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                if (start > end)
                    return true;
            }
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
