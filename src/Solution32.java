import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 最长有效括号
 */
public class Solution32 {
    public static void main(String[] args) {
        String s = "))))())(())()))(()()(())(())()))(((()()))()()))(())(())()())()(()())((()(((())()())(()())(())((()))))())()))" +
                "()(())))())()))(()))((()())((()(())))(()))))))))((())(()()((())()()(()))))(((()(())))())))()())))())()()())()(" +
                "())()(((())()))()()())))()())))()((((((())((())))((())())(((()())())()((((((()())((()()(())(()))(()())()))()((" +
                ")(()())(()))((())((())))))()()))))()())()))))((((())(())))((()))(()()()()()((())((((())())()())()())(()(()()))" +
                "())(((()())(()))()))(())()((()(())))))()())())()()(())))((())()()()))(())((()())))))((()((((()(((())()))))((" +
                ")))()()))(()(())(()((()()()))))()))()()(((()()(())())()(())(()()()))()(()())))()((()((()))))())()(())()(()()((()()())(((())((())))(()())))()))()()())()))((()))(((()()()((()))))()()()))()))())())))))())()))(()))))(()()()))()((())))((())))()))(()()()()()()(()))())())(((())))(())(()(()())((()()()()))()()(()()))(()())(()()()((()()(((()(()((()((((()((())((()()))))))()())())(()(())()((((()()()()()))))()())()((())))))))()(((()())))()(()()(()()()()))()((((()((())(())))())))(()()()())()))))))((()))())((())(()(()(((()()()((((()()))())()())()())()))))())()(((()))))()()())))(())())))(())())((()))(())))(((()()))((((()))(()()))())((()())(()))(()(())(()(()))((((((()()(()()(()))()(()(())((((((((()(()())((())))())()())(()(()()))))(()(()()()))(()((()(((())((())(())()(()()())(()))())((()((((((())())(())()(()()(()())(())())()()))())(()))(())))()())))()()((()))())()()(())(()())()())())())))()()))((((()((()(())(((())()((())(())())))))()(()))())()))())(((())))))((((()(()()))))(((())(((())((())))))()()))()(()(((((((()))))((()))())()(())()))())())((()))))((())(())))(((())((((()(())(())()(((((())))()))()(()())(()()(())()(((()))())())))()))()()())((";
        System.out.println(longestValidParentheses(s));

    }

    public static int longestValidParentheses(String s) {
        List<Integer> tempResult = new ArrayList<>();
        tempResult.add(0);
        for (int i = 2; i <= s.length(); i += 2) {
            for (int j = 0; j < s.length() - i + 1; j++) {
                String temp = s.substring(j, j + i);
                if (isTrue(temp, tempResult) == i) {
                    j = s.length();
                }
            }

        }
        Collections.sort(tempResult);
        return tempResult.get(tempResult.size() - 1);
    }

    private static int isTrue(String s, List<Integer> tempResult) {
        Stack<Character> stack = new Stack<>();
        int result = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (stack.empty()) {
                if (s.charAt(i) == ')') {
                    return 0;
                }
                stack.push(s.charAt(i));
                count++;
                continue;
            }
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                count++;
            } else {
                if (stack.pop() == '(') {
                    result += 2;
                    count--;
                } else {
                    stack.push(')');
                    stack.push(')');
                    count--;
                }
            }
        }
        if (count != 0)
            result = 0;
        tempResult.add(result);
        return result;
    }
}
