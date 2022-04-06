package bitOp;
/*
https://leetcode-cn.com/problems/prime-number-of-set-bits-in-binary-representation/solution/er-jin-zhi-biao-shi-zhong-zhi-shu-ge-ji-jy35g/
二进制表示中质数个计算置位
https://leetcode-cn.com/problems/number-of-1-bits/solution/wei-1de-ge-shu-by-leetcode-solution-jnwf/
191. 位1的个数
编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量)
 */

public class countPrimeSetBits {
    public int countPrimeSetBits(int left, int right) {
        int res=0;
        for (int i=left;i<=right;i++){
            if ((665772 & (1 << hanmingWeight(i))) != 0)    // 1 << n == pow(2,n)
                res++;
        }
        return res;

    }
    public int hanmingWeight(int n){
        //Integer.bitCount(n)
        /*
        int res = 0;
        for (int i=0;i<32;i++){
            if ((n & (1 << i)) != 0)
                res++;
        }
        return res;
        */
        int res=0;
        while (n!=0){
            n &= n-1;   //将最后一个1置0
            res++;      //置0次数即hanmingWeight
        }
        return res;
    }

}
