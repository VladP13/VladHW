package ua.artocde.week1.gy;
/*
Написать программу вычисления идеального веса пользователя (рост-
        100). Выдать рекомендации о необходимости поправиться либо поху-
        деть.
*/

import java.util.Scanner;

public class Work9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" введіть вашу вагу ");
        // введите рост, введите вес, посчитать оптимальный вес по формуле, сравнить с весом пользователя, и дать результат
        int weight = sc.nextInt();
        System.out.println("введіть ваш зріст");
        int height = sc.nextInt();
        int optimalWeight = height - 100;

        if (optimalWeight > weight) {
            System.out.println(" поправиться ");
        } else {
            System.out.println(" похудеть ");
        }

    }

}





