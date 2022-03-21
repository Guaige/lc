package DP;
/*
https://leetcode-cn.com/problems/jian-sheng-zi-lcof/solution/mian-shi-ti-14-i-jian-sheng-zi-tan-xin-si-xiang-by/
面试题14- I. 剪绳子（数学推导 / 贪心思想，清晰图解）
 */
public class cuttingRope {
    public int cuttingRope(int n) {
        /*
        if (n<=3)    return n-1;
        int a = n / 3,b = n % 3;
        if (b==0)   return (int)Math.pow(3,a);  //6 = 3 x 3
        if (b==1)   return (int)Math.pow(3,a-1) * 4;    7 = 3 * 4
        if (b==2)   return (int)Math.pow(3,a) * 2;      8 = 6 * 2
        return 0;
        */
        //贪心
        if (n<4)    return n-1;
        int res = 1;
        while (n > 4){
            res *= 3;
            n -= 3;
        }
        return res * n;
        //////////////////////////////////////////////
        if (n==0)   return 1;
        int[] dp = new int[n+1];
        dp[1] = 1;
        int res=0;
        for (int i=2;i<=n;i++){         //从2开始，可分
            for (int j=1;j<i;j++){      //最细分 1
                int tem = Math.max(dp[j] * (i-j),j * (i-j));
                                        //Max（j分开承，j本身） * （i-j）
                dp[i] = Math.max(dp[i],tem);    //遍历j 找到最大的分割点j
            }
        }
        return dp[n];
    }
}
