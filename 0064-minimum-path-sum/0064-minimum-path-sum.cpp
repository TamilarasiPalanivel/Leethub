class Solution {
public:
    int solve(int i, int j, int m, int n, vector<vector<int>>& G, vector<vector<int>>& dp) {
        if (i >= m || j >= n) return INT_MAX; 
        if (i == m - 1 && j == n - 1) return G[i][j]; 
        if (dp[i][j] != -1) return dp[i][j]; 

        dp[i][j] = G[i][j] + min(solve(i + 1, j, m, n, G, dp), solve(i, j + 1, m, n, G, dp));
        return dp[i][j];
    }

    int minPathSum(vector<vector<int>>& G) {
        int m = G.size();
        int n = G[0].size();
        vector<vector<int>> dp(m, vector<int>(n, -1)); 
        return solve(0, 0, m, n, G, dp);
    }
};
