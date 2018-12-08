/**
 * n皇后
 */
public class Solution52 {
    private int result = 0;

    public int totalNQueens(int n) {
        char[][] queen = new char[n][n];
        boolean[] col = new boolean[n];
        //判断左斜边和右斜边
        boolean[] obl = new boolean[2 * n];
        boolean[] lObl = new boolean[2 * n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                queen[i][j] = '.';
            }
        }

        backTrack(queen, col, obl, lObl, 0);
        return result;
    }

    public void backTrack(char[][] queen, boolean[] col, boolean[] obl, boolean[] lObl, int count) {
        if (count == col.length) {
            result++;
            return;
        }
        for (int i = 0; i < queen[count].length; i++) {
            if (col[i])
                continue;
            if (obl[i + count + 1])
                continue;
            if (lObl[i - count + col.length - 1])
                continue;
            queen[count][i] = 'Q';
            col[i] = true;
            obl[i + count + 1] = true;
            lObl[i - count + col.length - 1] = true;
            backTrack(queen, col, obl, lObl, count + 1);
            queen[count][i] = '.';
            col[i] = false;
            obl[i + count + 1] = false;
            lObl[i - count + col.length - 1] = false;
        }
    }

    public static void main(String[] args) {
        Solution52 solution52 = new Solution52();
        System.out.println(solution52.totalNQueens(0));
    }
}
