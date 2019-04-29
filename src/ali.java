import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 阿里笔试
 */
public class ali {
    public static String calculate(int m, int k) {
        ArrayList<Integer> pig = new ArrayList<>();
        ArrayList<Integer> reproduction = new ArrayList<>();
        HashMap<Integer, Integer> years = new HashMap<>();
        int[] arr = new int[m];
        arr[0] = 2;
        arr[1] = 3;
        int startYear = 2019;
        pig.add(2);
        pig.add(3);
        reproduction.add(1);
        reproduction.add(3);
        years.put(2, startYear);
        years.put(3, startYear);
        int nums = 2;
        int arrCount = 1;
        while (nums < m) {
            startYear++;
            int count = 0;
            for (int i = 0; i < reproduction.size(); i++) {
                if (reproduction.get(i) >= 2) {
                    count++;
                } else {
                    reproduction.set(i, reproduction.get(i) + 1);
                }
            }
            nums += count;
            int bianhao = 0;
            for (int j = 1; j <= count; j++) {
                if (pig.size() - 3 < 0)
                    bianhao = pig.get(pig.size() - 2) + 2;
                else
                    bianhao = pig.get(pig.size() - 2) + pig.get(pig.size() - 3);

                String temp = String.valueOf(bianhao);
                String reverse = new StringBuffer(temp).reverse().toString();
                if (arrCount + j < m)
                    arr[arrCount + j] = Integer.valueOf(reverse);
                pig.add(bianhao);
                reproduction.add(1);
                years.put(bianhao, startYear);
            }
            arrCount += count;
        }
        Arrays.sort(arr);
        int xuhao = pig.get(m - 1);
        return xuhao + "," + years.get(xuhao).toString() + "," + arr[m - k];
    }
}
