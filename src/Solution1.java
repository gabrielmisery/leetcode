import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        // write your code here
        int[] n = {2,7,11,15};
        System.out.print(Arrays.toString(twoSum(n, 9)));
    }
    public static int[] twoSum(int[] nums,int target){
        int numsLength = nums.length;
        int[] answer=new int[2];
        for(int fCount = 0;fCount<numsLength;fCount++){
            for(int sCount = fCount+1;sCount<numsLength;sCount++){
                if(nums[fCount]+nums[sCount]==target){
                    answer[0] = fCount;
                    answer[1] = sCount;
                    return answer;
                }
            }
        }
        return answer;
    }
}
