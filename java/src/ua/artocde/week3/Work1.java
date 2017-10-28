package ua.artocde.week3;
//
// Матрицы генерировать случайными числами и размер матрицы вводит юзер.


import ua.artocde.method.MatrixUtils;

import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter matrix tapes? ");
        ;
        int tapes = sc.nextInt();
        System.out.println(" enter matrix columns");
        int columns = sc.nextInt();

        int[][] matrix = MatrixUtils.genMatrix(tapes, columns);

        String s = MatrixUtils.toString(matrix);
        System.out.println(s);
    }
}
