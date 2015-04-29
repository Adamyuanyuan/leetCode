package easy.problem1_20;

/**
 * Created by Adam on 2015/4/28.
 */
public class CountPrime {
    public int countPrimes(int n) {
        if(n<3){
            return 0;
        }
        int result = 0;
        boolean[] notPrimeArray = new boolean[n];
        for(int i=2;i<n;i++){
            if(!notPrimeArray[i]){
                result++;
                for(int j=i+i;j<n;j+=i){
                    notPrimeArray[j] = true;
                }
            }
        }
        return result;

    }
}

