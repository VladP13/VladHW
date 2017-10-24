package ua.artocde.week2;

import ua.artocde.method.ArrayUtils;

import java.util.Scanner;

/*Сдвинуть массив на заданное количество позиций // {1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}
        Количество позиций и массив указывает пользователь*/
public class Work13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println(" size Array ");
        int size = sc.nextInt();

        System.out.println(" range array ");
        int range = sc.nextInt();

        System.out.println("move array to ");
        int move = sc.nextInt();

        int[] mas = ArrayUtils.generateMas(size, range);
        ArrayUtils.printArr(mas);

         int []mas1 = ArrayUtils.moveArrayRight(mas,move);
         ArrayUtils.printArr(mas1);


        }
    }

