package nums;

/*
https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
剑指 Offer 10- I. 斐波那契数列
 */
public class Fibonacci_qPow {
    static final int MOD = 1000000007;
    //DP 滚动数组 p,q,r p=q;q=r;r=update(r);
    /*
    public int fib(int n) {
        int a=0,b=1,sum;
        for (int i=0;i<n;i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
    */

    public int fib(int n){
        if (n==0) return 0;
        int[][] mat = {{1,1},{1,0}};
        int[][] res = qPow(mat,n-1);
        return res[0][0];
    }
    //矩阵快速幂
    public int[][] qPow(int[][] mat,int p){
        int[][] res = {{1,0},{0,1}};
        while (p>0){    //  出口
            if ((p&1) == 1) res = mult(res,mat);    //  奇数更新
            mat = mult(mat,mat);                    //  平方 o(Log.n)
            p >>= 1;                                //  右移
        }
        return res;


    }
    public static int[][] mult(int[][] a,int[][] b){
        int[][] res = new int[2][2];
        for (int i=0;i<2;i++)
            for (int j=0;j<2;j++)
                res[i][j] = (int) (((long) a[i][0]*b[0][j] + (long)a[i][1]*b[1][j])% 1000000007);
        return res;


    }
}
