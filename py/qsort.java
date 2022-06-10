import java.util.Arrays;

public class qsort {
    public static void main(String[] args) {
        int[] a = {4,7,2,9,1};
        qsort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void qsort(int[] a,int left,int right){
        if (left>right) return;
        int i=left,j=right;
        int t=a[left];
        while (i<j){
            while (i<j&&a[j]>=t)    j--;
            while (i<j&&a[i]<=t)    i++;
            if (i<j){
                int tem = a[i];
                a[i] = a[j];
                a[j] = tem;
            }
        }
        a[left] = a[i];
        a[i] = t;
        qsort(a,left,i-1);
        qsort(a,i+1,right);
    }
}
