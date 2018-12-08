import java.util.ArrayList;
import java.util.List;

/**
 * 正则表达式匹配
 */
public class Solution10 {
    public boolean isMatch(String s, String p) {
        if (p.contains(".*"))
            return true;
        if(s.equals("")){
            return p.equals("");
        }
        List<Character> temp = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '.') {
                if (isTrue(p.substring(0, i), p.substring(i), s))
                    return true;
            }
            if (p.charAt(i) == '*') {
                if (temp.contains(s.charAt(0)) || temp.contains('.')) {
                    if (isTrue(p.substring(0, i), p.substring(i), s))
                        return true;
                }
            }
            if (p.charAt(i) == s.charAt(0)) {
                if (isTrue(p.substring(0, i), p.substring(i), s))
                    return true;
            }
            temp.add(p.charAt(i));
        }
        return false;
    }

    public boolean isTrue(String head, String tail, String s) {
        int i = 0;
        for (; i < s.length() && i < tail.length(); i++) {
            if (tail.charAt(i) == '.') {
                head += '.';
                continue;
            } else if (tail.charAt(i) == '*') {
                if (head.contains(String.valueOf(s.charAt(i))) || head.contains(String.valueOf('.'))) {
                    head += '*';
                    if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)){
                        int temp = i;
                        while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                            if (isTrue(head, tail.substring(temp+1), s.substring(i+1))) {
                                return true;
                            }
                            i++;
                        }
                        return false;
                    }
                    continue;


                } else {
                    return false;
                }
            } else if (tail.charAt(i) == s.charAt(i)) {
                head += tail.charAt(i);
                continue;
            } else if (tail.charAt(i) != s.charAt(i)) {
                if (i-1 >= 0 && s.charAt(i) == s.charAt(i - 1) && tail.charAt(i - 1) == '*')
                    continue;
                else
                    return false;
            }
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        Solution10 solution10 = new Solution10();
        System.out.println(solution10.isMatch("aab",""));
    }
}
