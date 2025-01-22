class Solution {
    public int uniquePaths(int m, int n) {
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=1;
        }
        for(int j=0;j<m-1;j++){
            for(int i=1;i<n;i++){
                dp[i]=dp[i]+dp[i-1];
            }
        }
        return dp[n-1];
        
    }
}