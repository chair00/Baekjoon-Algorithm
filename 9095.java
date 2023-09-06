import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[11];
        StringBuilder sb = new StringBuilder();
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i=0; i<n; i++){
            int x = Integer.parseInt(br.readLine());
            for(int j=3; j<x+1; j++){
                if(dp[j]>0) continue;
                dp[j] = dp[j-3] + dp[j-2] + dp[j-1];
            }
            sb.append(dp[x]).append("\n");
        }

        System.out.print(sb);
    }
}