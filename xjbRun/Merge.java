package xjbRun;

import sort.qSort;

import java.util.Arrays;
import java.util.Random;

public class Merge {
    final static int N = 10;
    public static void main(String[] args) {
        int[] a = new int[N];
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = new Random().nextInt(100);
            b[i] = new Random().nextInt(100);
        }
        qSort.qSort(a,0,N-1);
        qSort.qSort(b,0,N-1);
        int[] merge = new int[2*N];
        int cur,cur1,cur2;
        cur = cur1 = cur2=0;
        /*
        while (cur1<N || cur2<N){
            if (cur1 == N)  merge[cur] = b[cur2++];
            else if (cur2 == N) merge[cur] = a[cur1++];
            else if (a[cur1]<b[cur2])  merge[cur] = a[cur1++];
            else    merge[cur] = b[cur2++];
            cur++;
        }

         */
        while(cur1<N && cur2 <N){
            if (a[cur1] < b[cur2])
                merge[cur] = a[cur1++];
            else    merge[cur] = b[cur2++];
            cur++;
        }
        while (cur1<N)  merge[cur++] = a[cur1++];
        while (cur2<N)  merge[cur++] = b[cur2++];
        System.out.println(Arrays.toString(merge));
    }
}
