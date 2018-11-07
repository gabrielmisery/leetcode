class Solution9 {
    public boolean isPalindrome(int x) {
        boolean result = false;
        int tag2 = x;
        if (x < 0)
            return false;
        int count;
        int tag = 0;
        while (x != 0) {
            count = x % 10;
            x = x / 10;
            tag = tag * 10 + count;
        }
        if(tag == tag2)
            result = true;
        return result;
    }
}
