package ua.artocde.week2;
//Посчитать сколько цифр(цифра задается пользователем) в массиве

import ua.artocde.method.ArrayUtils;

import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = sc.nextInt();

        int counter = 0;
        int[] arr = ArrayUtils.generateMas(10,10);

        for (int i = 0; i < arr.length; i++) {
            counter += ( arr[i] == number) ? 1 : 0;
        }

        ArrayUtils.printArr(arr);
        System.out.println("The number " + number + " repeats " + counter);

    }


}
