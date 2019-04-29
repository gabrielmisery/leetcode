/**
 * 解码方法
 */
public class Solution91 {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0')
            return 0;
        if (s.length() == 1)
            return 1;
        int length = s.length();
        int[] arr = new int[length];
        arr[0] = 1;
        if (s.charAt(0) <= '2') {
            if (s.charAt(1) == '0') {
                arr[1] = 1;
            }else if (s.charAt(0) == '1') {
                arr[1] = 2;
            } else {
                if (s.charAt(1) <= '6')
                    arr[1] = 2;
                else
                    arr[1] = 1;
            }
        } else {
            if (s.charAt(1) == '0') {
                return 0;
            }
            arr[1] = 1;
        }
        for (int i = 2; i < length; i++) {
            if (s.charAt(i) == '0') {
                if (s.charAt(i - 1) >= '3' || s.charAt(i - 1) == '0')
                    return 0;
                arr[i] = arr[i - 2];
            } else if ((s.charAt(i) >= '7' && s.charAt(i - 1) == '2') || s.charAt(i - 1) >= '3' || s.charAt(i - 1) == '0') {
                arr[i] = arr[i - 1];
            } else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        return arr[length - 1];
    }
}
