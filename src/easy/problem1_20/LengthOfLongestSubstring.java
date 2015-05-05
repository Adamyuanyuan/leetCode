package easy.problem1_20;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * Created by Adam on 2015/5/4.
 */
public class LengthOfLongestSubstring {
    // This way was time limit exceeded
    public int lengthOfLongestSubstringTimeLimited(String s) {
        if(s==null){
            return 0;
        }
        HashMap<Character,Integer> charIntMap = new HashMap<Character, Integer>();
        int maxLength = 0;
        int currentLength = 0;
        int lastIndex = 0;
        for(int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);
            if(!charIntMap.containsKey(currentChar)){
                charIntMap.put(currentChar, i);
                currentLength++;
            }else{
                if(currentLength>maxLength){
                    maxLength=currentLength;
                    currentLength=0;
                }
                lastIndex = charIntMap.get(currentChar);
                for(int j=0;j<=lastIndex;j++){
                    if(charIntMap.containsKey(s.charAt(j))){
                        charIntMap.remove(s.charAt(j));
                    }
                }
            }
        }
        return maxLength>currentLength ? maxLength:currentLength;
    }

    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        HashMap<Character,Integer> charIntMap = new HashMap<Character, Integer>();
        int max=0;

        for(int i=0,j=0;i<s.length();i++){
            char currentChar = s.charAt(i);
            if(charIntMap.containsKey(currentChar)){
                j=Math.max(j,charIntMap.get(currentChar)+1);
            }
            charIntMap.put(currentChar,i);
            max = Math.max(max,i-j+1);



        }
        return max;
    }

}
