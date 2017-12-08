package ua.artocde.week3;
//Создать массив, который будет состоять из диагонали матрици

import ua.artocde.method.ArrayUtils;
import ua.artocde.method.MatrixUtils;

import java.util.Scanner;

/**
 * Created by Влад on 28.10.2017.
 */
public class Work5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter matrix row?");
        int tapes = sc.nextInt();
        System.out.println(" enter matrix columns");
        int columns = sc.nextInt();

        int[][] mat = MatrixUtils.genMatrix(tapes, columns); // 4 rows x 6 columns ---> diagonal - 4

        int[] mas = new int[tapes]; // 4

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j) {
                    mas[i] = mat[i][j];
                }
            }
        }
        MatrixUtils.printMatrix(mat);
        ArrayUtils.printArr(mas);
    }
}
