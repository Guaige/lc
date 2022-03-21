package nums;
/*
https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/solution/mian-shi-ti-38-zi-fu-chuan-de-pai-lie-hui-su-fa-by/
剑指 Offer 38. 字符串的排列（回溯法，清晰图解）
 */

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class permutation {
    List<String> l = new LinkedList<>();
    char[] cl;

    public String[] permutation(String s) {
        cl = s.toCharArray();
        dfs(0);
        return l.toArray(new String[l.size()]);
    }
    public void dfs(int x){
        if (x == cl.length-1){
            l.add(String.valueOf(cl));return;
            //出口
        }
        Set<Character> ss = new HashSet<>();
        for (int i=x;i<cl.length;i++){
            if (ss.contains(cl[i])) continue;
            ss.add(cl[i]);
            //剪枝
            swap(i,x);  dfs(x+1); swap(i,x);
        }
    }
    public void swap(int a,int b){
        char t = cl[a];
        cl[a] = cl[b];
        cl[b] = t;
    }
}
