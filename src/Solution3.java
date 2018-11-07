import java.util.ArrayList;

public class Solution3 {
    public static void main(String[] args) {
        System.out.print(lengthOfLongestSubstring("ss"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }  else {
            ArrayList<Integer> answer = new ArrayList<Integer>();
            int sig2 = 0;
            String str = "";
            for (int sig = 0; sig < s.length(); sig++) {
                sig2 = s.indexOf(s.charAt(sig), sig + 1);
                if (sig2 == -1) {
                    for (int count = sig; count <= s.length(); count++) {
                        str = s.substring(sig, count);
                        if (isSame(str)) {
                            answer.add(count - sig);
                        }
                    }

                } else {
                    for (int count = sig; count <= sig2; count++) {
                        str = s.substring(sig, count);
                        if (isSame(str)) {
                            answer.add(count - sig);
                        }
                    }
                }
            }
            return Max(answer);
        }
    }

    private static Boolean isSame(String str) {
        for (int i = 1; i < str.length(); i++) {
            int sig = str.indexOf(str.charAt(i), i + 1);
            if (sig != -1)
                return false;

        }
        return true;
    }

    private static int Max(ArrayList list) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if ((int) list.get(i) > max) {
                max = (int) list.get(i);
            }
        }
        return max;
    }
}
