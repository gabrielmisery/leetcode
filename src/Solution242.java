import java.util.HashMap;
import java.util.Map;

/**
 * 有效的字母异位词
 */
public class Solution242 {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (!map.containsKey(t.charAt(i))) {
                return false;
            } else {
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            }
        }
        for (Character key : map.keySet()) {
            if (map.get(key) != 0)
                return false;
        }
        return true;
    }
}
