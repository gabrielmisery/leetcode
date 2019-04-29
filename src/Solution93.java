import java.util.ArrayList;
import java.util.List;

/**
 * 复原IP地址
 */
public class Solution93 {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        int minLength = s.length() / 4;
        int extra = s.length() - 4;
        String tempRes = "";
        backTrack(s, tempRes, 1, extra, result, 3, 0);
        return result;
    }

    public void backTrack(String s, String tempRs, int minLength, int extra, List<String> result, int next, int start) {
        if (next == 0) {
            if ((s.charAt(start) == '0' || Integer.valueOf(s.substring(start)) > 255) && s.substring(start).length() != 1)
                return;
            if (!result.contains(tempRs + "." + s.substring(start)))
                result.add(tempRs + "." + s.substring(start));
            return;
        }
        for (int length = 1; length <= 3; length++) {
            if ((s.substring(start).length() - length) > 3 * (next))
                continue;
            if ((s.substring(start).length() - length) < next)
                break;
            for (int i = 0; i <= extra && i + length <= 3; i++) {
                if (((s.substring(start).length() - length - i) > 3 * (next)) || (s.substring(start).length() - length - i) < next)
                    return;
                if ((s.charAt(start) == '0' || Integer.valueOf(s.substring(start, start + length + i)) > 255) && s.substring(start, start + length + i).length() != 1)
                    return;
                if (!tempRs.isEmpty()) {
                    backTrack(s, tempRs + "." + s.substring(start, start + length + i), minLength, extra - i, result, next - 1, start + length + i);
                } else {
                    backTrack(s, tempRs + s.substring(start, start + length + i), minLength, extra - i, result, next - 1, start + length + i);
                }
            }
        }
    }
}
