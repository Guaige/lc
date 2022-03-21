package sort;

import java.util.Arrays;
import java.util.Queue;
import java.util.Random;

public class HeapSort {

    public static void AdjustHeap(int[] n,int p,int length){
        int tem = n[p];
        for (int i = 2 * p + 1; i < length; i = 2 * i + 1) {
            if (i+1 < length && n[i] > n[i+1])  i++;
            if (n[i] < tem){
                n[p] = n[i];
                p = i; //此时p为指针，指向待修改的原子节点，原自己点的更大值已赋给父节点
            }
            else break; //父节点已经最大，孙节点不可能更大（因为for循环是从最后的非叶节点开始的）
        }
        n[p] = tem;     //就是n[i] = tem 交换的最后一句
    }

    public static void main(String[] args) {
        int[] n = new int[20];
        for (int i = 0; i < n.length; i++) {
            n[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(n));
        for (int i = n.length/2 - 1; i > -1 ; i--) {
            AdjustHeap(n,i,n.length);
        }
        System.out.println(Arrays.toString(n));
        for (int i = n.length-1; i > 0 ; i--) {
            int t = n[0];
            n[0] = n[i];
            n[i] = t;
            AdjustHeap(n,0,i); //Why 0? 上一个for循环已建立大顶堆，只需比较root和其两个子节点即可
        }
        System.out.println(Arrays.toString(n));

    }
}
