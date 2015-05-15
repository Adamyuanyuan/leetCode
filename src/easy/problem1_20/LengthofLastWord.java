package easy.problem1_20;

/**
 * Created by Adam on 2015/5/15.
 */
public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        int current = s.length()-1;
        while(current>0 && s.charAt(current)==' '){
            current--;
        }
        for(int i=current;i>=0;i--){
            if(s.charAt(i)==' '){
                return current-i;
            }
        }
        return current+1;
    }
}
