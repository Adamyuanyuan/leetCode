package easy.problem1_20;

/**
 * Created by Adam on 2015/4/28.
 */
public class StringToInteger {
    public static int myAtoi(String str) {
        if(str==null || str.length()==0){
            return 0;
        }
        char[] strArray = str.toCharArray();
        int i=0;
        while(strArray[i] == ' '){
            i++;
        }

        boolean isPositive = true;
        if(strArray[i]=='+'){
            i++;
        }else if(strArray[i]=='-'){
            i++;
            isPositive = false;
        }else if(strArray[i] < '0' || strArray[i] > '9'){
            return 0;
        }

        int j=i-1;
        while((j+1)<strArray.length && strArray[j+1]>='0' && strArray[j+1]<='9'){
            j++;
        }

        long result = 0;
        //@todo: try catch
        for(int k=j;k>=i;k--){
            result = result + (strArray[k]-'0') * (int)Math.pow(10,j-k);
            if(isPositive && result > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(!isPositive && (result-1) > Integer.MAX_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        return isPositive ? (int)result : -(int)result;
    }
}
