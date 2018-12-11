import java.util.ArrayList;
import java.util.List;

/**
 * 第K个排列
 */
public class Solution60 {
    int sumc = 0;
    public String getPermutation(int n, int k) {
        int[] array = new int[n];
        boolean[] judge = new boolean[n];
        int temp1 = 1;
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
            if (i > 0) {
                temp1 *= i;
            }
        }
        int sum = (int) Math.ceil((double) k / (double) temp1) - 1;
        k = k - temp1 * sum;
        List<String> list = new ArrayList<>();
        for (int i = sum; i < array.length; i++) {
            judge[i] = true;
            arrangement(array, judge, list, String.valueOf(array[i]), 1, k);
            judge[i] = false;
        }

        return list.get(k - 1);
    }

    public void arrangement(int[] array, boolean[] judge, List<String> list, String temp, int count, int k) {
        if (count == array.length) {
            list.add(temp);
            sumc++;
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (!judge[i]) {
                judge[i] = true;
                arrangement(array, judge, list, temp + String.valueOf(array[i]), count + 1,k);
                if(sumc == k)
                    return;
                judge[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Solution60 solution60 = new Solution60();
        System.out.println(solution60.getPermutation(9, 206490));
    }
}
