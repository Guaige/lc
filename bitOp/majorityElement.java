package bitOp;
/*
https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/solution/mian-shi-ti-39-shu-zu-zhong-chu-xian-ci-shu-chao-3/
剑指 Offer 39. 数组中出现次数超过一半的数字（摩尔投票法，清晰图解）
 */
public class majorityElement {
    public int majorityElement(int[] nums) {
        int x=0,vote=0;
        for (int n : nums){
            if (vote == 0)  x = n;
            vote += x == n ? +1 : -1;
        }
        return x;
        /*
        HashMap<Integer,Integer> m = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (!m.containsKey(nums[i]))    m.put(nums[i],1);
            else    m.put(nums[i],m.get(nums[i])+1);
        }
        for (int i : m.keySet())
            if (m.get(i)>nums.length/2)    return i;
        return 0;
        */
    }
}
