package ua.artocde.week3;
//	3.9. Умножить две матрицы.

import ua.artocde.method.MatrixUtils;

/**
 * Created by Влад on 03.11.2017.
 */
public class Work10 {
    public static void main(String[] args) {


        int[][] matrixA = MatrixUtils.genMatrixRange(3, 3, 10);
        int[][] matrixB = MatrixUtils.genMatrixRange(4, 2, 10);

        MatrixUtils.printMatrix(matrixA);
        MatrixUtils.printMatrix(matrixB);

        if (matrixA[0].length == matrixB.length) {
            int[][] result = new int[matrixA.length][matrixB[0].length];

            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    int sum = 0;

                    for (int k = 0; k < matrixA[i].length; k++) {
                        sum += matrixA[i][k] * matrixB[k][j];
                    }

                    result[i][j] = sum;
                }
            }
            MatrixUtils.printMatrix(result);
        }
    }
}