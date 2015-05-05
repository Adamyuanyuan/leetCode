package easy.problem1_20;

/**
 * Created by Adam on 2015/5/5.
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n - 1;
        m--;
        n--;
        while(m>=0 && n>=0){
            if(nums1[m]>=nums2[n]){
                nums1[length--]=nums1[m--];
            }else{
                nums1[length--]=nums2[n--];
            }
        }
        while(n>=0){
            nums1[n]=nums2[n];
            n--;
        }
    }
}
