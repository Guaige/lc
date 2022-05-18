package daily;

public class maxTriangleArea {
    public double largestTriangleArea(int[][] points) {
        double ret=0;
        int n = points.length;
        for (int i=0;i<n;i++)
            for (int j=i+1;j<n;j++)
                for (int k=j+1;k<n;k++){
                    int[] a = {points[j][0] - points[i][0], points[j][1] - points[i][1]};
                    int[] b = {points[k][0] - points[i][0], points[k][1] - points[i][1]};
                    ret = Math.max(ret, hl(a, b));
                }
        return ret;
    }
    public double hl(int[] a,int[] b){
        return Math.abs((a[0]*b[1] - a[1]*b[0]) / 2.0);
    }
}
