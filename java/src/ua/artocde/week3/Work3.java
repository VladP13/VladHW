package ua.artocde.week3;
//Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.

import ua.artocde.method.MatrixUtils;
/*
* t f f
* f t f
* f f t
* */

/**
 * Created by Влад on 27.10.2017.
 */
public class Work3 {
    public static void main(String[] args) {

        boolean[][] mat = new boolean[5][5];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = i == j; // i == j --> boolean

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
