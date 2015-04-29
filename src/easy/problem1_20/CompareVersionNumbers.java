package easy.problem1_20;

/**
 * Created by Adam on 2015/4/24.
 */
public class CompareVersionNumbers {
    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int l1 = v1.length;
        int l2 = v2.length;
        int i = 0;
        while(i<l1 && i<l2){
            if(Integer.valueOf(v1[i]) > Integer.valueOf(v2[i]) ){
                return 1;
            }else if(Integer.valueOf(v1[i]) < Integer.valueOf(v2[i])){
                return -1;
            }
            i++;
        }
        int result = 1;
        int max = l1;
        int min = l2;
        String[] longer = v1;
        if(l1<l2){
            result = -1;
            max = l2;
            min = l1;
            longer = v2;
        }
        for(int j=min;j<max;j++){
            if(Integer.valueOf(longer[j])>0){
                return result;
            }
        }
        return 0;

    }
}
