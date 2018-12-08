import java.util.HashMap;
import java.util.Map;

/**
 * 整数转罗马数字
 */
public class Solution13 {
    public int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
        result += map.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result -= map.get(s.charAt(i));
                continue;
            }
            result += map.get(s.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        System.out.println(solution13.romanToInt("LVIII"));
    }
}
