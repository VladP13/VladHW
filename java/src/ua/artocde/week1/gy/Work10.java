package ua.artocde.week1.gy;

import java.util.Scanner;

/*Написать программу вычисления стоимости переговоров, если по суббо-
        там и воскресеньям предоставляется 20% скидка. Ввести продолжитель-
        ность разговора и день недели (цифра от 1 до 7).*/
public class Work10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("введіть тривалість розмови");
        double speekTime = sc.nextInt();
        System.out.println("введіть день неділі");
        int day = sc.nextInt();

//        double priceSpeek = speekTime;
        double priceSpeekSaturdaySunday = speekTime * 0.8;

        if (day >= 1 && day <= 5) {
            System.out.println(speekTime + " тривалість розмови і вартість ");
        } else if (day <= 7) {
            System.out.println(priceSpeekSaturdaySunday);
        }

    }
}
