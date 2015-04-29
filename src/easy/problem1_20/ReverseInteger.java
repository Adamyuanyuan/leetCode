package easy.problem1_20;

/**
 * Created by Adam on 2015/4/24.
 */
public class ReverseInteger {
    public static String reverse(String str){
        StringBuffer bufferStr = new StringBuffer(str);
        bufferStr.reverse();
        return bufferStr.toString();

    }
    public static int reverse(int x) {
        String str = String.valueOf(x);
        try{
            if(str.charAt(0)=='-'){
                return -Integer.valueOf(reverse(str.substring(1,str.length())));
            }else{
                return Integer.valueOf(reverse(str));
            }
        }catch (Exception e){
            return 0;
        }

    }
}
