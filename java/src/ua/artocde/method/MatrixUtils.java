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

        String matRes = "";

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

    public static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
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

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean palindrome(String word) {

        // hello i'm vlad ---> ["hello", "i'm", "vlad"];
        // [h, e, l, l, ...o]
        char[] wordChars = word.toCharArray();

        for (int i = 0; i < wordChars.length / 2; i++) {
            if (wordChars[i] != wordChars[wordChars.length - 1 - i]) { // string.equals() -1 -i (кожен раз здвигать вліво
                // якщо просто -1 то просто весь час останніій елемент// )
                return false;
            }
        }
        return true;

    }

    public static int[][] genMatrixRange(int row, int columns, int range) {

        int[][] mat = new int[row][columns];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = ArrayUtils.getRandomNum(range);
            }
        }
        return mat;
    }

    //розмір стовбчика на розмір стрічки
    public static int[][] multiplyMatrix(int[][] matrixA, int[][] matrixB) {

        int[][] result = new int[matrixA.length][matrixB[0].length];

        if (matrixA[0].length == matrixB.length) {
            result = new int[matrixA.length][matrixB[0].length];

            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    for (int k = 0; k < matrixA[i].length; k++) {
                        result[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }

        }
        return result;
    }


    public static String[][] generateField(int rows, int columns) {
        String[][] field = new String[rows][columns];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = ".";
            }
        }
        return field;
    }


    public static int[][] rotate90(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            int temp[] = matrix[matrix.length - i - 1];
            for (int j = 0; j < matrix.length; j++) {
                result[j][i] = temp[j];
            }
        }
        return result;
    }


}
