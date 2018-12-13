/**
 * x的平方根
 */
// TODO: 2018/12/12
public class Solution69 {
    public int mySqrt(int x) {
        int head = 0, tail = 46340;
        int result = 0;
        boolean flag = true;
        if(x == 0 )
            return 0;
        if(x > (tail*tail))
            return tail;
        while (flag) {
            int temp = (int) Math.ceil((double) head + ((double)tail - (double)head) / 2);
            int temp2 = temp * temp;
            if (temp2 < x) {
                if ((temp + 1) * (temp + 1) > x) {
                    flag = false;
                    result = temp;
                }
                head = temp;
            } else if (temp2 > x) {
                if ((temp - 1) * (temp - 1) < x) {
                    flag = false;
                    result = temp - 1;
                }
                tail = temp;
            } else {
                flag = false;
                result = temp;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution69 solution69 = new Solution69();
        System.out.println(solution69.mySqrt(2147483647));
    }
}
