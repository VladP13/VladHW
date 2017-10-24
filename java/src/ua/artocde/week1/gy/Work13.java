package ua.artocde.week1.gy;
/*Даны три числа A,B,C. Увеличить числа в два
        раза, если A+B+C>0, в противном случае заменить
        на нули.*/

import java.util.Scanner;

public class Work13 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println(" введіть три числа ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b + c > 0) {
            System.out.println(a * 2);
            System.out.println(b * 2);
            System.out.println(c * 2);

        } else {
            System.out.println(" a = 0 , b = 0, c = 0 ");
        }
    }
}
