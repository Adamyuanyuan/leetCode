package easy.problem1_20;

/**
 * Created by Adam on 2015/4/28.
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {

        if(s == null || s.length() == 0 || s.length() == 1){
            return true;
        }

        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();

        while(left < right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }else if(s.charAt(left) != s.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }

        }

        return true;
    }
}

