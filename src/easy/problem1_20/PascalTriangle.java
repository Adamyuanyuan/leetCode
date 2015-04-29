package easy.problem1_20;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adam on 2015/4/24.
 */
public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<Integer> upList = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int i=0;i<numRows;i++){
            List<Integer> curruntList = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    curruntList.add(1);
                }else{
                    curruntList.add(upList.get(j-1)+upList.get(j));
                }
            }
            upList = curruntList;
            result.add(curruntList);
        }
        return result;
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> upList = new ArrayList<Integer>();

        for(int i=0;i<=rowIndex;i++){
            List<Integer> result = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    result.add(1);
                }else{
                    result.add(upList.get(j-1)+upList.get(j));
                }
            }
            upList = result;

        }
        return upList;
    }
}
