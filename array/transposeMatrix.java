package array;

import java.util.Arrays;

public class transposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length , column = matrix[0].length;
        int[][] res = new int[column][row];

        for(int i = 0 ; i < row * column ; i ++){
            res[i/row][i%row]  = matrix[i%row][i/row];
        }
        for (int[] i : matrix) System.out.println(Arrays.toString(i));
        for (int[] i : res) System.out.println(Arrays.toString(i));
        return res;
    }
}
