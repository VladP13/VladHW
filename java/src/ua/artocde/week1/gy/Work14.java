package ua.artocde.week1.gy;
/*Определить, является ли шестизначное число "счастливым" (сумма
        первых трех цифр равна сумме последних трех цифр).*/

import java.util.Scanner;

public class Work14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" введіть шестизначне число ");

        int a = sc.nextInt();
        int leftOne = a / 100000;
        int leftTwo = a / 10000 % 10;
        int leftThree = a / 1000 % 10;
        int rightThree = a / 100 % 10;
        int rightTwo = a / 10 % 10;
        int rightOneLest = a % 10;

        if (leftOne + leftTwo + leftThree == rightOneLest + rightThree + rightTwo) {
            System.out.println(" you lucky ");
        } else {
            System.out.println(" you loser");
        }

    }
}
