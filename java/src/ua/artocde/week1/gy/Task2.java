package ua.artocde.week1.gy;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
//Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
        // 124    4    -   true
        // 1456   567  -   false
        //  1      2    -   false
        // 18     98   -   true


        Scanner sc = new Scanner(System.in);
        System.out.println("введите два числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int resultaA = a % 10;
        int resultB = b % 10;

        if (resultaA == resultB) {
//            System.out.print(true + " ");
//            System.out.print(resultaA + ",");
//            System.out.print(resultB);
            System.out.println(true + " " + resultaA + "," + resultB);
        } else {
            System.out.println(false);
        }


    }
}
