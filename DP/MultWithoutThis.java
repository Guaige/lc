package DP;
/*
https://leetcode-cn.com/problems/gou-jian-cheng-ji-shu-zu-lcof/solution/mian-shi-ti-66-gou-jian-cheng-ji-shu-zu-biao-ge-fe/
剑指 Offer 66. 构建乘积数组（表格分区，清晰图解）
 */
public class MultWithoutThis {
    public static int[] constructArr(int[] a) {
        if (a.length==0)    return new int[0];
        int[] b = new int[a.length];
        b[0] = 1;
        for (int i=1;i<b.length;i++)
            b[i] = b[i-1] * a[i-1]; //下半三角
        int t=1;
        for (int i=b.length-2;i>-1;i--){
            t *= a[i+1];    //  累积
            b[i] *= t;      //再乘上半三角
        }
        return b;
        /*
        int[] res = new int[a.length];
        for (int i=0;i<a.length;i++){
            int t = 1;
            for (int j=0;j<a.length;j++)
                if (i!=j)   t *= a[j];
            res[i] = t;
        }
        return res;
        */
    }
}
