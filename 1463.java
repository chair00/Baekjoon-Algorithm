import java.io.*;
import java.lang.Math;

class Main{
    static int[] dp;
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n+1];

        System.out.print(recur(n));
    }
    static int recur(int n){
        if(n == 1)
            return 0;
        if(dp[n] > 0)
            return dp[n];
        dp[n] = recur(n-1) + 1;
        if(n%2==0){
             dp[n] = Math.min(dp[n], recur(n/2)+1);
        }
        if(n%3==0){
            dp[n] = Math.min(dp[n], recur(n/3)+1);
        }
        return dp[n];
    }
}