package array;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int res = BinarySearch(nums,target);
        if (res==-1)    return 0;
        int cur=res-1;
        int count = 1;
        while(cur>-1 && nums[cur--]==target)  count++;
        cur = res+1;
        while (cur<nums.length && nums[cur++]==target)  count++;
        return count;
    }
    public int BinarySearch(int[] n,int nn){
        int i=0,j=n.length-1;
        while (i<=j){
            int m = (i+j) / 2;
            if (n[m] == nn) return m;
            if (n[m] > nn)  j = m-1;
            else    i = m+1;
        }
        return -1;
    }

    static class ZuoXuan {
        public static void main(String[] args) {
            System.out.println(reverseLeftWords(
                    "lrloseumgh",6));
        }
        public static String reverseLeftWords(String s, int n) {
            char[] c = new char[s.length()];
            int l = 0;
            int r = n;
            int count = n;
            for (int i=0;i<s.length();i++)
                c[i] = s.charAt(i);
            Queue<Character> q = new LinkedList<>();
            while (count-->0)
                q.offer(c[l++]);
            l = 0;
            while (r < s.length()){

                c[l++] = c[r++];
            }
            while(!q.isEmpty()) c[l++] = q.poll();
            return new String(c,0,s.length());
        }
    }
}
