import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 合并区间
 */
public class Solution56 {
    public static class Interval {
        int start, end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int x, int y) {
            start = x;
            end = y;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        //插入排序
//        int[] temp = new int[intervals.size()];
//        for(int i = 0;i<intervals.size();i++){
//            if(i == 0){
//                temp[i] = i;
//                continue;
//            }
//            int length = i;
//            temp[length] = i;
//            while (length>0 && intervals.get(temp[length]).start < intervals.get(temp[length-1]).start){
//                int temp1 = temp[length-1];
//                temp[length-1] = i;
//                temp[length]=temp1;
//                length--;
//            }
//        }

        //排序
        intervals.sort(new Comparator<Interval>() {
            public int compare(Interval t1, Interval t2) {
                return t1.start - t2.start;
            }
        });
        List<Interval> result = new ArrayList<>();
        for (Interval interval : intervals) {
            if(result.isEmpty()) {
                result.add(interval);
                continue;
            }
            if(result.get(result.size()-1).end >= interval.start){
                result.get(result.size()-1).end = Math.max(interval.end,result.get(result.size()-1).end);
            }else {
                result.add(interval);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));
        intervals.add(new Interval(16, 33));
        Solution56 solution56 = new Solution56();
        solution56.merge(intervals);
    }

}
