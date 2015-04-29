package easy.problem1_20;

/**
 * Created by Adam on 2015/4/22.
 */
public class ExcelSheetColumnTitle {
    public static String convertToTitle(int n) {
        StringBuffer array = new StringBuffer();
        while(n>0){
            int currentNum = n%26;
            if(currentNum == 0){
                currentNum = 26;
            }
            char tempChar = (char) ('A' + currentNum-1);
            array.append(tempChar);
            n = (n - 1)/26;
        }
        array.reverse();
        return array.toString();
    }

}
