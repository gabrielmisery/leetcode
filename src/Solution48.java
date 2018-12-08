public class Solution48 {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = i; j < matrix[i].length - i; j++) {
                int temp = matrix[i][j];
                if (j + matrix[i].length - i - 1 - i >= matrix[i].length - i - 1) {
                    int row = j + matrix[i].length - i - 1 - i;
                    int col = matrix[i].length - 1 - i;
                    exchangeVal(matrix, row, col);
                }
            }
        }
    }

    public void exchangeVal(int[][] matrix, int row, int col) {

    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        Solution48 solution48 = new Solution48();
        solution48.rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
