package ua.artocde.week3;
//Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.

import ua.artocde.method.MatrixUtils;

/**
 * Created by Влад on 27.10.2017.
 */
public class Work3 {
    public static void main(String[] args) {

        boolean[][] mat = new boolean[3][3];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i] == mat[j]) {
                    mat[i][j] = true;
                } else {
                    mat[i][j] = false;
                }
            }
        }
        MatrixUtils.printMatrix(mat);
    }
}
