import java.util.Arrays;

public class permute {
    public static void main(String[] args) {
        int[] a = {4,7,2,9,1};
        dfs(a,0);

    }
    public static void dfs(int[] a, int cur){
        if (cur==a.length-1){
            System.out.println(Arrays.toString(a));
            return;
        }
        for (int i=cur;i<a.length;i++){
            swap(a,i,cur);
            dfs(a,cur+1);
            swap(a,i,cur);
        }
    }
    public static void swap(int[] a,int i,int j){
        int t= a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
