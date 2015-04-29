package easy.problem1_20;

/**
 * Created by Adam on 2015/4/28.
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        int longestIndex = 0;
        int lengthOfStrs = strs.length;
        for(int i=0;i<strs[0].length();i++){
            char currentChar = strs[0].charAt(i);
            boolean isEqual = true;
            for(int j=1;j<lengthOfStrs;j++){
                if(strs[j].length()<=i || strs[j].charAt(i)!=currentChar){
                    isEqual = false;
                }
            }
            if(!isEqual){
                break;
            }else{
                longestIndex++;
            }
        }
        String result = strs[0].substring(0,longestIndex);
        return result;
    }
}
