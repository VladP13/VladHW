package ua.artocde.week1.gy;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
//ользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число");
        int number = sc.nextInt();

        if (number % 7 == 0) {
            System.out.println("Делится на 7! Результат: " + number * 2);
        } else {
            System.out.println("Не делится на 7!");
        }
    }
}
