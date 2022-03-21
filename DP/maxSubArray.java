package DP;
/*
剑指 Offer 42. 连续子数组的最大和
https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 */
public class maxSubArray {

    public int maxSubArray(int[] n) {
        int SubArrayIncludeThis=0,res=n[0]; //注意res
        for(int i:n){
            SubArrayIncludeThis = Math.max(SubArrayIncludeThis + i, i); //对于包含当前i的字串，选最大（pre拖后腿就选单i）
            res = Math.max(res, SubArrayIncludeThis);   //选最大子串 可以跳过当前i
        }
        return res;
    }
}
