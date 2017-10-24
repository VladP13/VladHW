package ua.artocde.week1.gy;
/*Написать программу, которая в зависимости от характера ветра выдает
        сообщение о его скорости от 1до 4 м/с - слабый (1); от 5-10 м/c -
        умеренный (2); от 9-18 м/c - сильный (3); больше 19 м/c - ураганный (4).*/

import java.util.Scanner;

public class Work12 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println(" введіть яка швідкість вітру? ");
        int wind = sc.nextInt();

        if (wind >= 1 && wind <= 4) {
            System.out.println(wind + "м/с" + " вітер слабкий");
        } else if (wind >= 5 && wind <= 10) {
            System.out.println(wind + "м/с" + " вітер помірний ");
        } else if (wind >= 11 && wind <= 18) {
            System.out.println(wind + "м/с" + " вітер сильний ");
        } else if (wind > 19) {
            System.out.println(wind + "м/с" + " вітер ураганний");
        }
    }
}
