package easy.problem1_20;

import java.util.ArrayDeque;

/**
 * Created by Adam on 2015/4/22.
 */
public class ValidParentheses1 {
    public static boolean isValid(String s){
        if(s == null || s.length() == 0){
            return true;
        }
        if(s.length()%2 != 0){
            return false;
        }
        ArrayDeque<Character> charStack = new ArrayDeque();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                charStack.push(c);
            }else if(charStack.isEmpty()){
                return false;
            }else{
                char top = charStack.pop();
                if((top == '(' && c == ')') || (top == '[' && c == ']') || (top == '{' && c == '}')){
                }else{
                    return false;
                }
            }
        }
        return charStack.isEmpty();
    }
}
