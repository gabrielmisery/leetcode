import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 插入空间
 */
public class Solution57 {
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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<>();
        intervals.add(newInterval);
        intervals.sort(new Comparator<Interval>() {
            public int compare(Interval t1, Interval t2) {
                return t1.start - t2.start;
            }
        });
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
    public static void main(String[] args){
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(4, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(16, 33));
        Interval interval = new Interval(5,17);
        Solution57 solution57 = new Solution57();
        solution57.insert(intervals,interval);
    }
}
