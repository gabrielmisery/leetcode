public class Solution28 {
    public static void main(String[] args) {
        String haystack = "";
        String needle = "";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty())
            return 0;
        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                if (i + needle.length() > haystack.length())
                    return -1;
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
