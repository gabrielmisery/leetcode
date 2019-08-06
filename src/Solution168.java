/**
 * Excel列表列名称
 */
public class Solution168 {
    public String convertToTitle(int n) {
        int x = (n - 1) / 26;
        int y = (n - 1) % 26;
        String temp = "";
        if (x > 26) {
            temp = convertToTitle(x);
            return temp + String.valueOf((char) (y + 'A'));
        }
        if (x == 0) {
            return temp + String.valueOf((char) (y + 'A'));
        } else {
            return temp + String.valueOf((char) ((x - 1) + 'A')) + String.valueOf((char) (y + 'A'));
        }
    }
}
