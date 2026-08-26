class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1 );
        int count = step( n , dp);
        return count ; 
    }
    private static int step(int n , int[] dp ){
        if(n == 0 || n == 1){
            return 1 ; 
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = step(n-1 , dp) + step(n-2 , dp);
        return dp[n];
    }
}