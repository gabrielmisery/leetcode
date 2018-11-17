/**
 * 有效的数独
 */
public class Solution36 {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '1', '.', '.', '7', '.', '6', '.'},
                {'1', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(board));
    }

    private static boolean isValidSudoku(char[][] board) {
        boolean[][] col = new boolean[10][10];
        boolean[][] row = new boolean[10][10];
        boolean[][][] three = new boolean[10][10][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (row[i][board[i][j] - '0'] || col[j][board[i][j] - '0'] || three[i / 3][j / 3][board[i][j] - '0']) {
                        return false;
                    }
                    row[i][board[i][j] - '0'] = true;
                    col[j][board[i][j] - '0'] = true;
                    three[i / 3][j / 3][board[i][j] - '0'] = true;
                }
            }
        }
        return true;
    }
}
