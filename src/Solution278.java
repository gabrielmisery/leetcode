/**
 * 第一个错误的版本
 */
public class Solution278 {
    public int firstBadVersion(int n) {
        int index;
        if (n % 2 == 0)
            index = n / 2;
        else
            index = 1 + (n / 2);
        int res = 0;
        while (true) {
            if (isBadVersion(index)) {
                if (!isBadVersion(index - 1)) {
                    res = index;
                    break;
                } else {
                    n = index;
                    if (index % 2 == 0)
                        index = index / 2;
                    else
                        index = 1 + (index / 2);

                }
            } else {
                if (isBadVersion(index + 1)) {
                    res = index + 1;
                    break;
                } else {
                    if ((n - index) % 2 == 0)
                        index = index + (n - index) / 2;
                    else
                        index = index + 1 + (n - index) / 2;

                }
            }
        }
        return res;
    }

    public boolean isBadVersion(int n) {
        if (n < 11)
            return false;
        return true;
    }
}
