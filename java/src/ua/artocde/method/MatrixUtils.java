package ua.artocde.method;

import com.sun.org.glassfish.external.statistics.impl.StringStatisticImpl;

import java.io.StringReader;

/**
 * Created by Влад on 25.10.2017.
 */
public class MatrixUtils {
    public static String toString(int[][] mat) {

        if (mat == null) {
            return "wrong argument,mat is null";
        }
        if (mat.length == 0) {
            return "empty matrix";
        }

        String matRes = " ";

        for (int i = 0; i < mat.length; i++) {
            int[] row = mat[i];
            for (int j = 0; j < row.length; j++) {
                int col = mat[i][j];
                matRes += col + " ";
            }
            matRes += "\n";
        }
        return matRes;
    }

    public static int[][] genMatrix(int tapes, int columns) {

        int[][] mat = new int[tapes][columns];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = ArrayUtils.getRandomNum(100);

            }
        }
        return mat;
    }

    public static void printMatrix(boolean[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

   /* public static boolean palindrome(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                if(mat[i].length / 2 ==)

            }
        }
    }*/

}
