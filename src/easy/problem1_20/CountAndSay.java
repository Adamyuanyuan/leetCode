package easy.problem1_20;

/**
 * Created by Adam on 2015/5/14.
 */
public class CountAndSay {
    public String countAndSay(int n) {
        StringBuilder currentStringBuilder = new StringBuilder(2*n);
        currentStringBuilder.append(1);
        for(int i=0;i<n-1;i++){
            String currentString = currentStringBuilder.toString();
            //此处可以使用 .delete(0,currentStringBuilder.length())方法，
            // 但是由于Java pool的存在，对于此问题，使用setLength速度更快

            //也可以使用一个新的StringBuilder的方法，这个方法速度最慢，也不可取
            currentStringBuilder.setLength(0);

            int currentNum = 0;
            char currentChar = currentString.charAt(0);

            for(int j=0;j<currentString.length();j++){
                if(currentChar==currentString.charAt(j)){
                    currentNum++;
                }else{
                    currentStringBuilder.append(currentNum);
                    currentStringBuilder.append(currentChar);
                    currentNum=1;
                    currentChar=currentString.charAt(j);
                }
            }
            currentStringBuilder.append(currentNum);
            currentStringBuilder.append(currentChar);

        }
        return currentStringBuilder.toString();
    }
}
