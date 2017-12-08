package ua.artocde.week3;
//Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8

import ua.artocde.method.ArrayUtils;
import ua.artocde.method.MatrixUtils;

/**
 * Created by Влад on 27.10.2017.
 */
public class Work2 {
    public static void main(String[] args) {

        int[][] mat = MatrixUtils.genMatrix(3, 3);
        System.out.println(MatrixUtils.toString(mat));

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = mat[i][j] % 5 == 0 ? 8 : mat[i][j];
            }
        }

        System.out.println(MatrixUtils.toString(mat));
    }

}
