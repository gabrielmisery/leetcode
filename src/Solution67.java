/**
 * 二进制求和
 */
public class Solution67 {
    public String addBinary(String a, String b) {
        int i = 1, temp = 0;
        int aLength = a.length(), bLength = b.length(), length = Math.min(aLength, bLength);
        StringBuilder s = new StringBuilder();
        while (i <= length) {
            if (temp == 0) {
                if (a.charAt(aLength - i) == '1' && b.charAt(bLength - i) == '1') {
                    temp = 1;
                    s.insert(0, '0');
                } else if (a.charAt(aLength - i) == '1' || b.charAt(bLength - i) == '1') {
                    s.insert(0, '1');
                } else {
                    s.insert(0, '0');
                }
            } else {
                if (a.charAt(aLength - i) == '1' && b.charAt(bLength - i) == '1') {
                    s.insert(0, '1');
                } else if (a.charAt(aLength - i) == '1' || b.charAt(bLength - i) == '1') {
                    s.insert(0, '0');
                } else {
                    temp = 0;
                    s.insert(0, '1');
                }
            }
            i++;
        }
        if (aLength > bLength) {
            while (i <= aLength) {
                if (temp == 1) {
                    if (a.charAt(aLength - i) == '1') {
                        s.insert(0, '0');
                    } else {
                        s.insert(0, '1');
                        temp = 0;
                    }
                } else {
                    break;
                }
                i++;
            }
            s.insert(0, a.substring(0, aLength - i + 1));
        } else {
            while (i <= bLength) {
                if (temp == 1) {
                    if (b.charAt(bLength - i) == '1') {
                        s.insert(0, '0');
                    } else {
                        s.insert(0, '1');
                        temp = 0;
                    }
                } else {
                    break;
                }
                i++;
            }
            s.insert(0, b.substring(0, bLength - i + 1));
        }
        if (temp == 1)
            return '1' + s.toString();
        return s.toString();
    }

    public static void main(String[] args) {
        Solution67 solution67 = new Solution67();
        System.out.println(solution67.addBinary("10", "100001"));
    }
}
