import java.util.Arrays;

/**
 * 求众数
 */
public class Solution169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1,temp = nums[0],max=0,res = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(temp == nums[i]){
                count++;
            }else{
                temp = nums[i];
                count = 1;
            }
            if(count >= (nums.length/2)){
                if(max < count){
                    max = count;
                    res = temp;
                }
            }
        }
        return res;
    }
}
