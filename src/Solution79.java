/**
 * 单词搜索
 */
public class Solution79 {
    public boolean exist(char[][] board, String word) {
        int row = board.length, col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == word.charAt(0)) {
                    visited[i][j] = true;
                    if (backTrack(board, word, i, j, 0, visited)) {
                        return true;
                    }
                    visited[i][j] = false;
                }
            }
        }
        return false;
    }

    public boolean backTrack(char[][] board, String word, int row, int col, int start, boolean[][] visited) {
        if (start == word.length() - 1)
            return true;
        //向上
        if (row - 1 >= 0 && board[row - 1][col] == word.charAt(start + 1) && !visited[row - 1][col]) {
            visited[row - 1][col] = true;
            if (backTrack(board, word, row - 1, col, start + 1, visited)) {
                return true;
            }
            visited[row - 1][col] = false;
        }
        //向右
        if (col + 1 < board[0].length && board[row][col + 1] == word.charAt(start + 1) && !visited[row][col + 1]) {
            visited[row][col + 1] = true;
            if (backTrack(board, word, row, col + 1, start + 1, visited)) {
                return true;
            }
            visited[row][col + 1] = false;
        }
        //向下
        if (row + 1 < board.length && board[row + 1][col] == word.charAt(start + 1) && !visited[row + 1][col]) {
            visited[row + 1][col] = true;
            if (backTrack(board, word, row + 1, col, start + 1, visited)) {
                return true;
            }
            visited[row + 1][col] = false;
        }
        //向左
        if (col - 1 >= 0 && board[row][col - 1] == word.charAt(start + 1) && !visited[row][col - 1]) {
            visited[row][col - 1] = true;
            if (backTrack(board, word, row, col - 1, start + 1, visited)) {
                return true;
            }
            visited[row][col - 1] = false;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution79 solution79 = new Solution79();
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        System.out.println(solution79.exist(board, ""));
    }
}
