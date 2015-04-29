package easy.problem1_20;

/**
 * Created by Adam on 2015/4/22.
 */
public class FactorialTrailingZeros {
    public static int trailingZeroes(int n) {
        n = Math.abs(n);
        int zeroNumber = 0;
        double div = 0;
        int power = 1;
        while(div < n){
            div =  Math.pow(5,power);
            zeroNumber += (int) (n/div);
            power++;
        }
        return zeroNumber;
    }
}
