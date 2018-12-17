/**
 * 搜索二维矩阵
 */
public class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0)
            return false;
        int row = matrix.length, col = matrix[0].length;
        int head = 0, tail = col - 1;
        if(target < matrix[0][0] || target>matrix[row-1][col-1])
            return false;
        for (int i = 0; i < row; i++) {
            if (target <= matrix[i][col - 1] && target >= matrix[i][0]) {
                while (head <= tail) {
                    if (matrix[i][head] == target || matrix[i][tail] == target)
                        return true;
                    head++;
                    tail--;
                }
            }
        }
        return false;
    }
}
