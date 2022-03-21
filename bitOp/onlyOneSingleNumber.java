package bitOp;
/*
https://leetcode-cn.com/problems/single-number/
136. 只出现一次的数字
 */
public class onlyOneSingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i : nums)  res ^= i;
        return res;
        /*
        if (nums.length==1) return nums[0];
        for (int i=1;i<nums.length;i++)
            nums[0] ^= nums[i];
        return nums[0];
        */
    }
}
