package ua.artocde.week1.gy;

import java.util.Scanner;

/*Вычислить факториал числа.*/
public class Work17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("число");

        int n = sc.nextInt();
        int result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;
        System.out.println(result);
    }
}
