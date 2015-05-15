package easy.problem1_20;

/**
 * Created by Adam on 2015/5/15.
 */
public class ClimbingStairs {
    //reverse algorithm time limit exceeded
    public int climbStairsReverse(int n) {
        if(n<3){
            return n;
        }
        return climbStairsReverse(n - 1)+climbStairsReverse(n - 2);
    }

    //Dynamic Programming
    public int climbStairs(int n) {
        if(n<3){
            return n;
        }
        int[] stepArray = new int[n+1];
        stepArray[0] = 0;
        stepArray[1] = 1;
        stepArray[2] = 2;
        for(int i=3;i<n+1;i++){
            stepArray[i]=stepArray[i-1]+stepArray[i-2];
        }
        return stepArray[n];
    }

    // other algorithm
    public int climbStairsO1(int n) {
        int result=n,one=1,two=2;
        for(int i=3;i<=n;i++)
        {
            result=one+two;
            one = two;
            two = result;
        }
        return result;
    }

}
