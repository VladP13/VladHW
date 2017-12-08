package ua.artocde.week3;
//Повернуть матрицу(Двухмерный массив). Матрица квадратная. Пользователь вводит угол кратный 90.

import ua.artocde.method.MatrixUtils;

import java.util.Scanner;

/**
 * Created by Влад on 17.11.2017.
 */
public class Work12 {
    public static void main(String[] args) {

        int[][] mat = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        MatrixUtils.printMatrix(mat);
        int[][] res = rotate90(mat);
        MatrixUtils.printMatrix(res);
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