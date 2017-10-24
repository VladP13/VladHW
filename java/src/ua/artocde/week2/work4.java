package ua.artocde.week2;

import ua.artocde.method.ArrayUtils;
import ua.artocde.method.ArrayUtils;
import static ua.artocde.method.ArrayUtils.genRandomMasEvenNam;

/*
Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные
*/
public class work4 {
    public static void main(String[] args) {

        int[] mas = ArrayUtils.generateMas(10, 10);

        /*int index1 = mas[1];
        int index2 = mas[2];*/

        for (int i = 0; i < mas.length; i++) {
            int number = ArrayUtils.getRandomNum(10);

            if(i % 2 == 0){
                mas[i] = (number % 2 == 0) ? number : number + 1;
            } else {
                mas[i] = (number % 2 !=0 ) ? number : number +1;
            }

        }

        ArrayUtils.printArr(mas);
            }

    }




