import java.util.Arrays;

public class heapSort {
    public static void adjustHeap(int[] a, int cur, int l){
        int t = a[cur];
        for (int i=2*cur+1;i<l;i = 2*i+1){
            if (i+1<l && a[i]>a[i+1])   i++;
            if (a[i]<t){
                a[cur] = a[i];
                cur = i;
            }
            else break;
        }
        a[cur] = t;
    }

    public static void main(String[] args) {
        int[] a = {4,7,2,9,4,1};
        for (int i = a.length/2-1;i>-1;i--){
            adjustHeap(a,i,a.length);
        }
        for (int i=a.length-1;i>0;i--){
            int t=a[0];
            a[0] = a[i];
            a[i] = t;
            adjustHeap(a,0,i);
        }
        System.out.println(Arrays.toString(a));
    }
}

