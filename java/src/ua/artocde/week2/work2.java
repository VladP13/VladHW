package ua.artocde.week2;

/*
Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй
*/


import ua.artocde.method.ArrayUtils;

import static ua.artocde.method.ArrayUtils.generateMas;

public class work2 {
    public static void main(String[] args) {

        int[] mas1 = ArrayUtils.generateMas(5,10);
        int[] mas2 = ArrayUtils.generateMas(5,10);

        ArrayUtils.printArr(mas1);
        ArrayUtils.printArr(mas2);

        for (int i = 0; i < mas1.length; i++) {
            mas2[i] = mas1[i];
        }

        ArrayUtils.printArr(mas1);
        ArrayUtils.printArr(mas2);

        //int[] blabla = {1, 2, 3}; // blabla -----> array-{1, 2, 3} // 3sf298fsd1



        // mas ----> перемышуэ --- новий масив
    }
}
