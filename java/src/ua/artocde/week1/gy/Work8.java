package ua.artocde.week1.gy;

import java.util.Scanner;

/*Вычислить стоимость покупки с учетом скидки. Скидка в 10% предос-
        тавляется, если сумма покупки превышает 1000 гривен.*/
public class Work8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" введіть сумму покупки ");

        int a = sc.nextInt();
//        int skidka = a /  10;

        if (a >= 1000) {
            int skidka = a / 10;
            System.out.println(a - skidka);
        } else {
            System.out.println(false);
        }

    }

}
