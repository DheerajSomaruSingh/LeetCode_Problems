class Solution {
    int n;
    public int minFallingPathSum(int[][] grid) {
        n = grid.length;
        int dp[][] = new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        int minval = Integer.MAX_VALUE;
        for(int col=0;col<n;col++){
            minval = Math.min(minval,minsum(grid,0,col,dp));
        }
        return minval;
    }
    public int minsum(int[][] grid, int row,int col,int dp[][]){
        if(row==n-1){
            return dp[row][col] = grid[row][col];
        }
        if(dp[row][col]!=Integer.MAX_VALUE){
            return dp[row][col];
        }
        int minval = Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            if(j!=col){
                minval = Math.min(minval,minsum(grid,row+1,j,dp));
            }
        }
        return dp[row][col] = grid[row][col] + minval;
    }
}