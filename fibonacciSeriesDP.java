import java.util.Arrays;
public class  fibonacciDP{
    public static int fibonacciSeriesMemoization(int n, int[] dp){
        if(n<=1){
            return n;
        }
        
        if(dp[n]!=-1){
            return dp[n];
        }
        
        
        dp[n]=fibonacciSeriesMemoization(n-1, dp)+fibonacciSeriesMemoization(n-2, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        //Memoization DP
        System.out.println("Memoization DP:");
        int n=6;
        int dp[]=new int[n+1];
        Arrays.fill(dp, -1);
        for(int i=0; i<=n; i++){
            System.out.print(fibonacciSeriesMemoization(i, dp)+" ");
        }
        System.out.println();
        
        
        //Tabulation DP
        System.out.println("Tabulation DP:");
        int[] dp1=new int[n+1];
        dp1[0]=0;
        dp1[1]=1;
        for(int i=2; i<=n; i++){
            dp[i]=dp1[i-1]+dp1[i-2];
        }
        
        for(int i=0; i<=n; i++){
            System.out.print(dp1[i]+" ");
        }
    }
}
