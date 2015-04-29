package easy.problem1_20;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Adam on 2015/4/28.
 */
public class RomanToInteger {
    private static final Map<Character,Integer> romanToIntMap = new HashMap<Character,Integer>();
    static{
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);
    }
    public static int romanToInt(String s) {
        int previousNum = romanToIntMap.get(s.charAt(0));
        int result = romanToIntMap.get(s.charAt(0));

        for(int i=1;i<s.length();i++){
            if(romanToIntMap.get(s.charAt(i))>previousNum){
                result -= 2*previousNum;
            }
            previousNum = romanToIntMap.get(s.charAt(i));
            result += romanToIntMap.get(s.charAt(i));
        }
        return result;
    }
}
