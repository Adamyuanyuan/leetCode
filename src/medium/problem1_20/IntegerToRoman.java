package medium.problem1_20;

/**
 * Created by Adam on 2015/5/18.
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        int[] weights={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] tokens={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        int start = 0;
        while(num>0){
            for(int i=start;i<13;i++){
                if(num>=weights[i]){
                    sb.append(tokens[i]);
                    num-=weights[i];
                    break;
                }
                start = i+1;
            }
        }
        return sb.toString();

    }
}
