/**
 * 计数质数
 * 运用埃拉托色筛选法筛选出所有小于n的质数
 * 这个算法的原理是：一个质数总是可以分解成若干个质数的乘积，那么如果把质数（最初只知道2是质数）的倍数都去掉，那么剩下的就是质数了。
 */
public class Solution204 {
    public int countPrimes(int n) {
        if(n<=2)
            return 0;
        int count = 0;
        boolean[] arr = new boolean[n];
        //假设所有的都是质数
        for(int i = 2;i<n;i++){
            if(!arr[i]){
                count++;
                for(int j = 2;i*j<n;j++){
                    arr[i*j] = true;
                }
            }
        }
        return count;
    }
}
