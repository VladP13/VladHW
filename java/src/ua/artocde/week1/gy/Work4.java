package ua.artocde.week1.gy;
/*Известны две скорости, одна в километрах в час, другая в метрах в секун-
        ду. Какая из них больше?*/

import java.util.Scanner;

public class Work4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("введіть км/год");
        int kmhod = sc.nextInt();
        double km = kmhod / 3.6;

        System.out.println("введіть м/сек");
        int mc = sc.nextInt();


        if (km > mc) {
            System.out.println(km + " км/год " + " більше ніж " + mc + " м/сек ");
        } else {
            System.out.println(mc + " м/сек " + " більше ніж " + km + " км/год ");
        }


    }
}
