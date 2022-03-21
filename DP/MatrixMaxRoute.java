package DP;
/*
剑指 Offer 47. 礼物的最大价值
https://leetcode-cn.com/problems/li-wu-de-zui-da-jie-zhi-lcof/
 */
public class MatrixMaxRoute {
    public int maxValue(int[][] grid) {
        int m = grid.length,n = grid[0].length;
        for (int i=1;i<m;i++)   grid[i][0] += grid[i-1][0];
        for (int i=1;i<n;i++)   grid[0][i] += grid[0][i-1];
        for (int i=1;i<m;i++)
            for(int j=1;j<n;j++){
                grid[i][j] += Math.max(grid[i-1][j],grid[i][j-1]);
                // 当前总路径为其左和上前驱的较大值
            }
        return grid[m-1][n-1];
    }
}
