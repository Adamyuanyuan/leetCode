package easy.problem1_20;

/**
 * Created by Adam on 2015/5/5.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int number=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[number++]=nums[i];
            }
        }
        return number;
    }
}
