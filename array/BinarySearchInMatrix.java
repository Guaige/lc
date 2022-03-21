package array;

public class BinarySearchInMatrix {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length-1,j = 0;
        //二叉搜索树，左下角元素先往上 变小，再往右 变大
        while (i>-1 && j < matrix[0].length){
            if (matrix[i][j] > target)  i--;
            else if (matrix[i][j] < target) j++;
            else return true;
        }
        return false;
    }
}
