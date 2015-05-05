package easy.problem1_20;

/**
 * Created by Adam on 2015/5/5.
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        int lastNum = nums[0];
        int newLength = 1;
        for(int i=1;i<nums.length;i++){
            if(lastNum != nums[i]){
                newLength++;
                lastNum = nums[i];
                nums[newLength-1]=nums[i];
            }
        }
        return newLength;
    }
}
