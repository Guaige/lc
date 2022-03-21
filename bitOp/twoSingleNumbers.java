package bitOp;
/*
https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/solution/jian-zhi-offer-56-i-shu-zu-zhong-shu-zi-tykom/
剑指 Offer 56 - I. 数组中数字出现的次数（位运算，清晰图解）
 */

public class twoSingleNumbers {
    public int[] singleNumbers(int[] nums) {
        int xXory = 0;
        for (int n : nums)  xXory ^= n; //x XOR y
        int m = 1;
        while ((xXory & m) == 0)    m <<=1; //x XOR y 最右1
        int x=0,y=0;
        for (int n : nums){
            if ((n & m) == 0)   x ^= n;
            else    y ^= n;
        }
        return new int[]{x,y};

    }
}
