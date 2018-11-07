import java.util.ArrayList;
import java.util.List;

public class Solution22 {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String temp = "";
        int sum = 0;
        getResult(result, temp, sum, n, n);
        return result;
    }

    public static void getResult(List<String> result, String temp, int sum, int n1, int n2) {
        if (sum + 1 >= 0 && n1 > 0) {
            getResult(result, temp + '(', sum + 1, n1 - 1, n2);
        }
        if (sum - 1 >= 0 && n2 > 0) {
            getResult(result, temp + ')', sum - 1, n1, n2 - 1);
        }
        if (n1 == 0 && n2 == 0) {
            result.add(temp);
        }
    }
}
