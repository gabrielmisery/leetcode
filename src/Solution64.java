/**
 * 最小路径和
 */
public class Solution64 {
    public int minPathSum(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int[][] path = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 && j == 0) {
                    path[i][j] = grid[i][j];
                } else if (i == 0) {
                    path[i][j] = path[i][j - 1] + grid[i][j];
                } else if (j == 0) {
                    path[i][j] = path[i - 1][j] + grid[i][j];
                } else {
                    path[i][j] = Math.min(path[i - 1][j] + grid[i][j], path[i][j - 1] + grid[i][j]);
                }
            }
        }
        return path[row - 1][col - 1];
    }

    public static void main(String[] args) {
        Solution64 solution64 = new Solution64();
        System.out.println(solution64.minPathSum(new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}}));
    }
}
