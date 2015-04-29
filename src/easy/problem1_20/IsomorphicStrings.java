package easy.problem1_20;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by Adam on 2015/4/29.
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s==null){
            return t==null;
        }
        HashMap<Character,Character> charToCharMap = new HashMap<Character,Character>();
        for(int i=0;i<s.length();i++){
            char currChar = s.charAt(i);
            if(charToCharMap.containsKey(currChar) && charToCharMap.get(currChar)!=t.charAt(i)){
                return false;
            }else if(!charToCharMap.containsKey(currChar) && charToCharMap.containsValue(t.charAt(i))){
                return false;
            }else{
                charToCharMap.put(currChar,t.charAt(i));
            }

        }
        return true;
    }
}
