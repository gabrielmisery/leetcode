import java.util.HashMap;

/**
 * 解数独
 */
public class Solution37 {

    private void solveSudoku(char[][] board) {
        boolean col[][] = new boolean[9][10];
        boolean row[][] = new boolean[9][10];
        boolean[][][] three = new boolean[3][3][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    row[i][board[i][j] - '0'] = true;
                    col[j][board[i][j] - '0'] = true;
                    three[i / 3][j / 3][board[i][j] - '0'] = true;
                }
            }
        }
        solveProblem(board, col, row, three);
    }

    private void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private boolean solveProblem(char[][] board, boolean[][] col, boolean[][] row, boolean[][][] three) {
        int i = 0, j = 0;
        boolean flag = true;
        for (int indexRow = 0; indexRow < 9; indexRow++) {
            for (int indexCol = 0; indexCol < 9; indexCol++) {
                if (board[indexRow][indexCol] == '.') {
                    flag = false;
                    i = indexRow;
                    j = indexCol;
                    indexRow = 10;
                    break;
                }
            }
        }
        //已经填满
        if (flag)
            return true;
        for (int k = 1; k < 10; k++) {
            if (!row[i][k] && !col[j][k] && !three[i / 3][j / 3][k]) {
                board[i][j] = (char) (k + '0');
                col[j][k] = true;
                row[i][k] = true;
                three[i / 3][j / 3][k] = true;
                if (solveProblem(board, col, row, three)) {
                    return true;
                } else {
                    board[i][j] = '.';
                    col[j][k] = false;
                    row[i][k] = false;
                    three[i / 3][j / 3][k] = false;
                }
            }
        }

        return false;

    }

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        Solution37 solution37 = new Solution37();
        solution37.solveSudoku(board);
        solution37.printBoard(board);
    }
}
