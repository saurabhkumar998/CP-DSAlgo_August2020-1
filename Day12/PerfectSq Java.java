import java.util.*;

public class Solution {
    public static int numSquares(int n) {
       int[] dp = new int[n + 1];
       Arrays.fill(dp, Integer.MAX_VALUE);
       dp[0] = 0;
       for(int i = 0; i <= n; i++){
           for(int j = 1; i + j * j <= n; j++){
               dp[i  + j * j] = Math.min(dp[i + j * j], dp[i] + 1);
            }
       }
       return dp[n];
    }

    public static void main(String args[]) 
    { 
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
            int n = scn.nextInt();
            int ans = numSquares(n);
            System.out.println(ans); 
            t--;
        }
    } 

}