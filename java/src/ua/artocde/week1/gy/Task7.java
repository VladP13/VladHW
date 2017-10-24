package ua.artocde.week1.gy;

import java.util.Scanner;

public class Task7 {
    //Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("введите два числа");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int summa = a + b;

        if (summa >= 11 && summa <= 19) {
            System.out.println(summa);
        } else {
            System.out.println("сумма не в діапазоні 11 - 19");
        }

    }
}
