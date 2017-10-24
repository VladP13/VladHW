package ua.artocde.week2;

import ua.artocde.method.ArrayUtils;

/*
Найти минимальное и максимальное значения в массиве и вывести их на консоль
*/
public class work1 {
    public static void main(String[] args) {


        int[] mas = ArrayUtils.generateMas(10, 20);

        int min = mas[0];
        int max = mas[0];
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < mas.length ; i++) {
            if( mas[i] < min){
                min = mas[i];
                indexMin = i;
            }
        }

        for (int i = 0; i < mas.length ; i++) {
            if(mas[i] > max)
                max = mas[i];
                indexMax = i;
        }

        mas[indexMin] = max;
        mas[indexMax] = min;

        System.out.println(min);
        System.out.println(max);
    }
}
