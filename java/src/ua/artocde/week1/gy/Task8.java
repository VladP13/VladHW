package ua.artocde.week1.gy;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
// Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем
// результат деления (целую часть от деления  и остачу
// в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)
        Scanner sc = new Scanner(System.in);

        System.out.println("введите два числа");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int resultDilenny = a / b;
        int ostacha = a % b; // 5 seconds

        if (ostacha == 0) {
            System.out.println(resultDilenny + " ціла частина ");
            System.out.println(ostacha + " остача ");
        } else {
            System.out.println(ostacha + " остача ");
            System.out.println(resultDilenny + " ціла частина ");
        }

    }

}