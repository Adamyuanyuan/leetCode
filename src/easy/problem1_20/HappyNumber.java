package easy.problem1_20;

import java.util.HashSet;

/**
 * Created by Adam on 2015/4/22.
 */
public class HappyNumber {
    public static boolean isHappy(int n){
        HashSet<Integer> set = new HashSet<Integer>();
        while (n != 1) {
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
            int newNum = 0;
            while (n >= 1) {
                newNum += Math.pow(n % 10,2);
                n = n / 10;
            }
            n = newNum;
        }
        return true;
    }
}


