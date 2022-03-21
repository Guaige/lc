package DP;

import java.util.HashMap;

/*
剑指 Offer 48. 最长不含重复字符的子字符串
https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/
 */
public class lengthOfLongestSubString {
    /*  O(N2)
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==1)  return 1;
        int l = s.length();
        int resIncludeThis=0,res=0;
        for (int i=1;i<l;i++)
            res = Math.max(res,LongestSubStringIncludeThis(s,i));
        return res;
    }

    public static int LongestSubStringIncludeThis(String s,int cur){
        HashSet<Character> hs = new HashSet<>();
        int res = 0;
        while (hs.add(s.charAt(cur--))){
            res++;
            if (cur<0)  break;
        }
        return res;
    }
    */

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> m = new HashMap<>();
        int tem=0,res=0;
        for (int i=0;i<s.length();i++){
            int index = m.getOrDefault(s.charAt(i),-1);
            m.put(s.charAt(i),i);   //更新字典，字符最近的索引
            if (i - index > tem)    tem = tem + 1;  //相同字符在上次子串区间外，+1
            else    tem = i - index;                //区间内
            res = Math.max(res, tem);
        }
        return res;
    }

/*
        public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int res = 0, tmp = 0;
        for(int j = 0; j < s.length(); j++) {
            int i = dic.getOrDefault(s.charAt(j), -1); // 获取索引 i
            dic.put(s.charAt(j), j); // 更新哈希表
            tmp = tmp < j - i ? tmp + 1 : j - i; // dp[j - 1] -> dp[j]
            res = Math.max(res, tmp); // max(dp[j - 1], dp[j])
        }
        return res;
    }
*/
}
