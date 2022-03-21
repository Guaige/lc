package DP;
/*
https://leetcode-cn.com/problems/jump-game/solution/tiao-yue-you-xi-by-leetcode-solution/
跳跃游戏
 */
public class arrayJump {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i=0;i<nums.length;i++){
            if (i>max)  return false;   //跳不过去了
            else {
                max = Math.max(max,i+nums[i]);      //更新max
                if (max >= nums.length-1)   return true;    // 覆盖
            }
        }
        return false;
    }
}
