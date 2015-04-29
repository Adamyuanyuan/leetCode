package easy.problem1_20;

/**
 * Created by Adam on 2015/4/22.
 */
public class MojorityElement {
    public static int majorityElement(int[] nums) {
        int length = nums.length;
        int result = 0;
        int num = 0;
        for(int i=0;i<length;i++){
            if(result != nums[i]){
                if(num>0){
                    num--;
                }else{
                    result = nums[i];
                }
            }else{
                num++;
            }
        }
        return result;
    }
}
