import java.util.HashMap;
import java.util.Map;

/**
 * 字符串中的第一个唯一字符
 */
public class Solution387 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
            } else {
                map.put(s.charAt(i), -1);
            }
        }
        int res = -1;
        for (Character key : map.keySet()) {
            if (map.get(key) >= 0) {
                if (res >= 0) {
                    res = res > map.get(key) ? map.get(key) : res;
                } else
                    res = map.get(key);
            } else {
                res = res >= 0 ? res : -1;
            }
        }
        return res;
    }
}
