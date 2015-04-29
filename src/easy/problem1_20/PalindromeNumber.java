package easy.problem1_20;

/**
 * Created by Adam on 2015/4/28.
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }else if(x<10){
            return true;
        }

        int y = x;
        int z = 0;
        try{
            while(y>0){
                int w = y%10;
                z = z*10+w;
                y /= 10;
            }
        }catch (Exception e){
            return false;
        }
        return x==z;
    }
}
