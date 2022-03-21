package array;
/*
https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/solution/mian-shi-ti-29-shun-shi-zhen-da-yin-ju-zhen-she-di/
面试题29. 顺时针打印矩阵（模拟、设定边界，清晰图解）
 */
public class spiralMatrix {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length==0) return new int[0];
        int[] res = new int[(matrix.length) * (matrix[0].length)];
        int cur=0,l=0,t=0,r=matrix[0].length - 1,b = matrix.length - 1;
        while (true){   //出口 边界跳出
            // l >> r t >> b
            // l >> r t++
            for (int i=l;i<=r;i++)  res[cur++] = matrix[t][i];
            if (++t > b)    break;
            //t >> b    r--
            for (int i=t;i<=b;i++)  res[cur++] = matrix[i][r];
            if (--r < l)    break;
            //r >> l    b--
            for (int i=r;i>=l;i--)  res[cur++] = matrix[b][i];
            if (--b < t)    break;
            //b >> t    l++
            for (int i=b;i>=t;i--)  res[cur++] = matrix[i][l];
            if (++l > r)    break;
        }
        return res;
    }
}
