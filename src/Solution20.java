import java.util.Stack;

public class Solution20 {


    public static void main(String[] args) {
        String s = "{[]}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.empty())
                stack.push(s.charAt(i));
            else {
                Character character = stack.pop();
                switch (s.charAt(i)){
                    case '}':{
                        if(character != '{'){
                            stack.push(character);
                            stack.push(s.charAt(i));
                        }
                        break;
                    }
                    case ']':{
                        if(character != '['){
                            stack.push(character);
                            stack.push(s.charAt(i));
                        }
                        break;
                    }
                    case ')':{
                        if(character != '('){
                            stack.push(character);
                            stack.push(s.charAt(i));
                        }
                        break;
                    }
                    default:{
                        stack.push(character);
                        stack.push(s.charAt(i));
                        break;
                    }
                }
            }
        }
        return stack.empty();
    }
}
