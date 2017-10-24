package ua.artocde.week2;


import ua.artocde.method.ArrayUtils;

import java.util.Scanner;

/*Найти среднее арифметическое массива*/
public class work5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("input size");
        int size = sc.nextInt();

        System.out.println("input range");
        int range = sc.nextInt();

        int[] mas = ArrayUtils.generateMas(size, range);

        int sumMas = 0;
        for (int i = 0; i < mas.length; i++) {
            sumMas+= mas[i];
        }

        ArrayUtils.printArr(mas);
        System.out.println(sumMas);
        System.out.println(sumMas/size);
    }
}
