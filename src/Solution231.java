public class Solution231 {
    public boolean isPowerOfTwo(int n) {
        if(n == 0 || n == Integer.MIN_VALUE)
            return false;
        n = n & (n - 1);
        return n == 0;
    }

}
