public class Solution8 {
    public static void main(String[] args) {
        System.out.print(myAtoi(" +123s "));
    }

    public static int myAtoi(String str) {
        double result = 0;
        String[] array = str.split(" ");
        String tag = "";
        boolean signal = false;
        for (String anArray : array) {
            if (!anArray.isEmpty()) {
                tag = anArray;
                break;
            }
        }
        for (int i = 0; i < tag.length(); i++) {
            if (Character.isDigit(tag.charAt(i))) {
                result = result * 10 +  tag.charAt(i) - '0';
            } else if (tag.charAt(i) == '-' && i == 0) {
                signal = true;
            } else if (tag.charAt(i) == '+' && i == 0) {

            } else {
                break;
            }
        }
        if (signal)
            result = -result;
        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return (int) result;
    }
}
