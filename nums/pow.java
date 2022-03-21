package nums;
/*
剑指 Offer 16. 数值的整数次方
https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/
 */

public class pow {
    public double myPow(double x, int n) {
        double res=1;
        long b = n;
        if (x==0)   return 0;
        //负数处理
        if (n<0){
            x = 1/x;
            b *= -1;
        }
        while (b>0){
            //if ((b&1) == 1)
            if ((b&1)==1)   //b%2
                res *= x;   //b=1 乘一次结束；b=其他奇数，更新res
            x *= x;                     //都乘 平方
            b >>= 1;                    //右移 /=2
        }
        return res;
    }
}
