package sort;

import java.util.Random;

public class qSort {

    public static void qSort(int[] n,int left,int right){
        if (left>right) return;
        int i=left,j=right,tem=n[left];
        while (i<j){
            while (i<j && tem <=n[j])   j--;    //取i=l，一定要先确定j
            while (i<j && tem >=n[i])   i++;
            if (i<j){
                int t=n[i];
                n[i] = n[j];
                n[j] = t;
            }
        }
        n[left] = n[i];
        n[i] = tem;
        qSort(n,left,i-1);
        qSort(n,i+1,right);
    }

    public static void main(String[] args) {
        int[] n = new int[20];
        for (int i = 0; i < n.length; i++) {
            n[i] = new Random().nextInt(100);
            System.out.print(' ' + String.valueOf(n[i]));
        }
        qSort(n,0,n.length-1);
        System.out.println();
        for (int i = 0; i < n.length; i++) {
            System.out.print(' ' + String.valueOf(n[i]));
        }

    }
}
