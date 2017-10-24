package ua.artocde.week1.gy;

import java.util.Scanner;

public class Task6 {
    //Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел. Если второе больше, то выводим сумму.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ведите два числа");

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            int resultRiznyca = a - b; // 2 min
            System.out.println(resultRiznyca + "-різниця чисел");
        } else {
            int resultSumma = a + b;
            System.out.println(resultSumma + "-сумма чисел");
        }

    }
}

