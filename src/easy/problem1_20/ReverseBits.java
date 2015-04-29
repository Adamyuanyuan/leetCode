package easy.problem1_20;

import java.util.HashSet;

/**
 * Created by Adam on 2015/4/22.
 */
public class ReverseBits {
    public static int reverseBits(int n) {
        int result = 0;
        for(int i=0;i<32;i++){
            result = result*2 + (n & 1);
            n >>= 1;
        }
        return result;
    }
}
