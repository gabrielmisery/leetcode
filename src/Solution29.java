public class Solution29 {

    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 2;
        System.out.println(divide(num1, num2));
    }

    public static int divide(int dividend, int divisor) {
        System.out.println(dividend >> 1);
        double num1 = Math.abs((double) dividend);
        double num2 = Math.abs((double) divisor);

        int count = 0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }

        if (dividend * divisor > 0)
            return count;
        else return -count;
    }
}
