public class Solution14 {
    public static void main(String[] args) {
        String[] str = new String[]{"doggwe","doggs"};
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length == 0)
            return result;
        String common = shortestStr(strs);
        boolean signal;
        for(int i=0;i<common.length();i++){
            signal=true;
            for(int j = 0;j<strs.length;j++){
                if(common.charAt(i)!=strs[j].charAt(i)){
                    signal=false;
                    break;
                }
            }
            if(signal)
                result+=common.charAt(i);
            else
                break;
        }
        return result;
    }
    private static String shortestStr(String[] strs) {
        int res = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[res].length() > strs[i].length())
                res = i;
        }
        return strs[res];
    }
}
