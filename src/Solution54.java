import java.util.ArrayList;
import java.util.List;

/**
 * 螺旋矩阵
 */
public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        if(matrix.length == 0)
            return result;
        boolean[][] count = new boolean[matrix.length][matrix[0].length];
        findPath(matrix, count, 0, 0, result);
        return result;
    }

    /**
     *
     * @param matrix
     * @param count 记录是否已经读取
     * @param row 行
     * @param col 列
     * @param result
     */
    public void findPath(int[][] matrix, boolean[][] count, int row, int col, List<Integer> result) {
        count[row][col] = true;
        result.add(matrix[row][col]);
        //向上
        if (row - 1 >= 0 && !count[row - 1][col]) {
            //是否可以向左
            if (col - 1 >= 0 && !count[row][col - 1]) {
                findPath(matrix, count, row, col - 1, result);
            } else
                findPath(matrix, count, row - 1, col, result);
        }
        // 向右
        else if (col + 1 < matrix[row].length && !count[row][col + 1]) {
            findPath(matrix, count, row, col + 1, result);
        }
        //向下
        else if (row + 1 < matrix.length && !count[row + 1][col]) {
            findPath(matrix, count, row + 1, col, result);
        }
        //向左
        else if (col - 1 >= 0 && !count[row][col - 1]) {
            findPath(matrix, count, row, col - 1, result);
        }
    }

    public static void main(String[] args) {
        Solution54 solution54 = new Solution54();
        int[][] matrix = new int[][]{
                {1,2},
                {3,4}

        };
        solution54.spiralOrder(matrix);
    }

}
