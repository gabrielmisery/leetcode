class Solution7 {
    public int reverse(int x) {
        int count;
        double result = 0;
        while (x != 0) {
            count = x % 10;
            x = x / 10;
            result = result * 10 + count;
        }
        if(result>=Integer.MIN_VALUE&&result<=Integer.MAX_VALUE)
            return (int)result;
        else
            return 0;
    }
}
