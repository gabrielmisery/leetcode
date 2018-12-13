/**
 * 不同路径II
 */
public class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length, col = obstacleGrid[0].length;
        int flag1 = 1, flag2 = 1;
        int[][] path = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (obstacleGrid[i][j] == 1) {
                    if (i == 0 && flag1 != 0)
                        flag1 = 0;
                    if (j == 0 && flag2 != 0)
                        flag2 = 0;
                    path[i][j] = 0;
                } else {
                    if (i == 0 || j == 0) {
                        if (i == 0) {
                            path[i][j] = flag1;
                        } else {
                            path[i][j] = flag2;
                        }
                    } else {
                        path[i][j] = path[i - 1][j] + path[i][j - 1];
                    }
                }
            }
        }
        return path[row - 1][col - 1];
    }

    public static void main(String[] args) {
        Solution63 solution63 = new Solution63();
        System.out.println(solution63.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {1, 1, 0}, {0, 0, 0}}));
    }
}
