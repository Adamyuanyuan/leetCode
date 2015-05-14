package easy.problem1_20;

/**
 * Created by Adam on 2015/5/5.
 */
public class ImplementStrStr {
    public int strStrNormal(String haystack, String needle) {
        if(needle==null||needle.length()==0){
            return 0;
        }
        if(haystack==null||haystack.length()==0){
            return -1;
        }
        int needleLength = needle.length();
        int j=0;
        for(int i=0;i<haystack.length();){
            if(haystack.charAt(i)==needle.charAt(j)){
                j++;
                if(j==needleLength){
                    return i-needleLength+1;
                }
                i++;
            }else{
                i=i-j+1;
                j=0;
            }
        }
        return -1;
    }

    // Use KMP algorithm
    public int strStr(String haystack, String needle) {
        if(needle==null||needle.length()==0){
            return 0;
        }
        if(haystack==null||haystack.length()==0){
            return -1;
        }

        int[] next = new int[needle.length()];
        getNext(needle,next);
        int i=0,j=0;

        while(i<haystack.length()&&j<needle.length()){
            if(j==-1 || haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }else{
                j=next[j];
            }
        }
        if(j==needle.length()){
            return i-j;
        }else{
            return -1;
        }
    }

    private void getNext(String needle,int[] next){
        int k = -1;
        int j = 0;
        next[0] = -1;
        while(j < needle.length()-1){
            if(k==-1||needle.charAt(k)==needle.charAt(j)){
                ++k;
                ++j;
                if(needle.charAt(k)!=needle.charAt(j)){
                    next[j]=k;
                }else{
                    next[j]=next[k];
                }
            }else{
                k=next[k];
            }
        }
    }
}





















