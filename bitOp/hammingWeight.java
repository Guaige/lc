package bitOp;
/*
https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
汉明重置
 */
public class hammingWeight {
    public int hammingWeight(int n) {
        int count=0;
        while (n!=0){
            /*
            count += (n&1);     //末位1则自增
            n >>>=1;            //无符号右移
            */
            count++;            //只要还有1 自增
            n &= n-1;             //n&(n-1) 最后一个1变0
        }
        return count;
    }
}
