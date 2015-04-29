package easy.problem1_20;

/**
 * Created by Adam on 2015/4/28.
 */
public class HouseRobber {
    public static int rob(int[] nums) {
        int length = nums.length;
        if(length==0){
            return 0;
        }else if(length==1){
            return nums[0];
        }else if(length==2){
            return Math.max(nums[0],nums[1]);
        }
        int[] newNums = new int[length];
        newNums[0] = nums[0];
        newNums[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<length;i++){
            newNums[i] = Math.max(newNums[i-1],newNums[i-2]+nums[i]);
        }
        return newNums[length-1];
    }
}
