package easy.problem1_20;

/**
 * Created by Adam on 2015/4/22.
 */
public class ExcelSheetColumnNumber {
    public static int titleToNumber(String s) {
        int length = s.length();
        int resultNum = 0;
        for(int i=0;i<=length-1;i++){
            resultNum += Math.pow(26,length-1-i) * (s.charAt(i) - 'A' + 1);
        }
        return resultNum;
    }
}
