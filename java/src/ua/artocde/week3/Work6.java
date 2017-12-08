package ua.artocde.week3;
/*а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
        b) Поменять наибольший и наименьший столбик в двухмерном массиве.*/

import ua.artocde.method.MatrixUtils;

/**
 * Created by Влад on 28.10.2017.
 */
public class Work6 {
    public static void main(String[] args) {

        int[][] mat = MatrixUtils.genMatrixRange(3, 3, 5);
        /*System.out.println(MatrixUtils.toString(mat));*/
        MatrixUtils.printMatrix(mat);

        int sumMax = Integer.MIN_VALUE;
        int sumMin = Integer.MAX_VALUE;
        int maxIndex = 0; // 2
        int minIndex = 0; // 1

        for (int i = 0; i < mat.length; i++) { // arrays
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) { // values
                sum += mat[i][j];
            }
            if (sum > sumMax) {
                sumMax = sum;
                maxIndex = i;
            }

            if (sum < sumMin) {
                sumMin = sum;
                minIndex = i;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            int[] temp = mat[maxIndex];
            mat[maxIndex] = mat[minIndex];
            mat[minIndex] = temp;

        }
        MatrixUtils.printMatrix(mat);

        // b) Поменять наибольший и наименьший столбик в двухмерном массиве.*/

        int sumMax1 = Integer.MIN_VALUE;
        int sumMin1 = Integer.MAX_VALUE;
        int maxIndex1 = 0; // 2
        int minIndex1 = 0;

        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[j][i];
            }
            if (sum > sumMax1) {
                sumMax1 = sum;
                maxIndex1 = i;
            }

            if (sum < sumMin1) {
                sumMin1 = sum;
                minIndex1 = i;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            int temp1 = mat[i][maxIndex1];
            mat[i][maxIndex1] = mat[i][minIndex1];
            mat[i][minIndex1] = temp1;
        }

        MatrixUtils.printMatrix(mat);


    }
}
