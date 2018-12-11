/**
 * 螺旋矩阵II
 */
public class Solution59 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        clockWise(matrix, 0, 0, 1);
        return matrix;
    }

    public void clockWise(int[][] matrix, int row, int col, int count) {
        matrix[row][col] = count;
        if (row - 1 >= 0 && matrix[row - 1][col] == 0) {
            if (col - 1 >= 0 && matrix[row][col - 1] == 0) {
                clockWise(matrix, row, col - 1, count + 1);
            } else {
                clockWise(matrix, row - 1, col, count + 1);
            }
        } else if (col + 1 < matrix[0].length && matrix[row][col + 1] == 0) {
            clockWise(matrix, row, col + 1, count + 1);
        } else if (row + 1 < matrix.length && matrix[row + 1][col] == 0) {
            clockWise(matrix, row + 1, col, count + 1);
        } else if (col - 1 >= 0 && matrix[row][col - 1] == 0) {
            clockWise(matrix, row, col - 1, count + 1);
        }
    }
}
