package easy.problem1_20;

/**
 * Created by Adam on 2015/4/22.
 */
public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        int start = 0-k;
        for(;start<0;){
            start += length;
        }
        if(start == 0){
            return;
        }
        start = length - start;
        if(length>1) {
            swap(nums, 0, length - 1);
            swap(nums, 0, start - 1);
            swap(nums, start, length - 1);
        }
    }

    public static void swap(int[] nums,int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}
