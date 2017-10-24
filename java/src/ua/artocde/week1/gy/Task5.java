package ua.artocde.week1.gy;

import java.util.Scanner;

public class Task5 {
    //Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("введите число");
        double a = sc.nextDouble();

        if (a > 0 && a < 1) {
            System.out.println("число в межах 0 і 1");
        } else {
            System.out.println("число Не в межах 0 і 1");
        }

    }
}
