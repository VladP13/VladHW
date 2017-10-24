package ua.artocde.week1.gy;

import java.util.Scanner;

//5) Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна
//пара равных
public class Work5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("введіть три числа");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b || a == c || b == c) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
