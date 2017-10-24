package ua.artocde.week1.gy;

import java.util.Scanner;

public class Work3 {
    /*Дано трехзначное число. Определить: а) верно ли, что все его цифры
            одинаковые; б) есть ли среди его цифр одинаковые.*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" введите трехзначное число");

        int a = sc.nextInt();

        int three = a % 10;
        int one = a / 100;
        int two = a / 10 % 10;

        if (one == two && two == three) {
            System.out.println(true);
        } else {
            System.out.println(one + "," + two + "," + three);
        }


    }
}
