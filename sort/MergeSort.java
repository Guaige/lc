package sort;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
final static int N = 20;
    public static void main(String[] args) {
        int[] a = new int[N];
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = new Random().nextInt(100);
            b[i] = new Random().nextInt(100);
        }
        int[] t = new int[N];
        msort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void msort(int[] n,int l,int r){
        if (l>=r)   return;
        int m = (l+r) / 2;
        msort(n,l,m);
        msort(n,m+1,r);
        merge(n,l,r);
    }

    private static void merge(int[] n, int l, int r) {
        int[] t = new int[n.length];
        int m = (l+r) / 2;
        int i = l,j = m+1;
        int h = l;int cur = 0;
        while(i<=m && j<=r){
            if (n[i] < n[j])   t[cur] = n[i++];
            else t[cur] = n[j++];
            cur++;
        }
        while(i<=m)  t[cur++] = n[i++];
        while(j<=r)  t[cur++] = n[j++];
        cur = 0;
        while(h<=r)  n[h++] = t[cur++];
    }
}
