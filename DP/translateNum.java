package DP;

/*
剑指 Offer 46. 把数字翻译成字符串
https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/
 */

public class translateNum {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int p=0,q=0,r=1;    //滚动数组，pqr缺一不可，q缓存上一次循环的r值再传给p
        for (int i=0;i<s.length();i++){
            p=q;q=r;
            if (i==0)   continue;
            String ss = s.substring(i-1,i+1);
            if (ss.compareTo("25") <= 0 && ss.compareTo("10") >= 0) r += p;
            //如果成立，多一种组合方式，不成立组合数不变，即单字母
        }
        return r;
    }
}
