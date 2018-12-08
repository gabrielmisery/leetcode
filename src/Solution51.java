import java.util.ArrayList;
import java.util.List;

/**
 * n皇后
 */
public class Solution51 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
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

        backTrack(queen, col, obl, lObl, 0, result);
        return result;
    }

    public void backTrack(char[][] queen, boolean[] col, boolean[] obl, boolean[] lObl, int count, List<List<String>> result) {
        if (count == col.length) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < col.length; i++) {
                temp.add(String.valueOf(queen[i]));
            }
            result.add(temp);
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
            backTrack(queen, col, obl, lObl, count + 1, result);
            queen[count][i] = '.';
            col[i] = false;
            obl[i + count + 1] = false;
            lObl[i - count + col.length - 1] = false;
        }
    }

    public static void main(String[] args) {
        Solution51 solution51 = new Solution51();
        solution51.solveNQueens(4);
    }
}
