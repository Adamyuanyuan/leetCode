package easy.problem1_20;

/**
 * Created by Adam on 2015/4/24.
 */
public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        int length = s.length();
        if(numRows < 2 || length<numRows){
            return s;
        }
        StringBuffer result = new StringBuffer();
        int span = 2*numRows - 2;
        for(int i=0;i<numRows;i++){
            for(int j=i;j<length;j = j + span){
                result.append(s.charAt(j));
                if(i != 0 && i != (numRows-1) && (j+span-2*i)<length){
                    result.append(s.charAt(j+span-2*i));
                }
            }
        }
        return result.toString();

    }
}
