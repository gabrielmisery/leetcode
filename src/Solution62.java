/**
 * 不同路径
 */
public class Solution62 {
    public int uniquePaths(int m, int n) {
        int[][] path = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(i == 0 || j == 0){
                    path[i][j] = 1;
                }else {
                    path[i][j] = path[i][j-1]+path[i-1][j];
                }
            }
        }
        return path[m-1][n-1];
    }
    public static void main(String[] args){
        Solution62 solution62 = new Solution62();
        System.out.println(solution62.uniquePaths(3,3));
    }
}
