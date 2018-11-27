/**
 *最长回文字串
 */
public class Solution5 {

    public static void main(String[] args) {
        System.out.print(longestPalindrome("bababab"));
    }

    public static String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            int start = i;
            while (true) {
                start = s.indexOf(s.charAt(i), start + 1);
                if (start == -1)
                    break;
                else {
                    String str = s.substring(i, start + 1);
                    if (isTrue(str)) {
                        if (str.length() > answer.length())
                            answer = str;
                    }
                }
            }
        }
        if (answer.length() == 0) {
            answer = s.substring(s.length() - 1);
        }
        return answer;
    }

    public static Boolean isTrue(String str) {
        int sLength = (str.length() / 2);
        for (int i = 1; i <= sLength; i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1))
                continue;
            else
                return false;
        }
        return true;
    }
}
