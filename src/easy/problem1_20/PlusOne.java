package easy.problem1_20;

/**
 * Created by Adam on 2015/5/15.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int[] result = new int[length+1];
        int carry = 1;
        for(int i=length-1;i>=0;i--){
            if(digits[i]+carry>9){
                result[i+1] = 0;
                carry = 1;
            }else{
                result[i+1] = digits[i]+carry;
                carry = 0;
            }
        }
        if(carry==1){
            result[0]=1;
            return result;
        }else{
            int[] newResult = new int[length];
            System.arraycopy(result,1,newResult,0,length);
            return newResult;
        }
    }
}
