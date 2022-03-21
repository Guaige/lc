package array;
/*
https://leetcode-cn.com/problems/rotate-matrix-lcci/solution/xuan-zhuan-ju-zhen-by-leetcode-solution/
顺时针旋转矩阵
 */
public class clockWiseRotateMatrix {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i=0;i<n/2;i++)
            for (int j=0;j<(n+1)/2;j++){    //考虑奇数，分块2x3，扁
                int t = matrix[i][j];
                /*
                matrix[i][j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = t;
                */
                //倒序，第一步一定是将第四步的值替换到[i][j]
                matrix[i][j] = matrix[n-1-j][i];         // [n-1-j][i] >> [i][j]
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j]; // [n-1-i][n-1-j] >> [n-1-j][i]
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i]; // [j][n-1-i] >> [n-1-i][n-1-j]
                matrix[j][n-1-i] = t;                    // [i][j] >> [j][n-1-i]
            }
        //return matrix;
    }
}
