package ua.artocde.week1.gy;

import java.util.Scanner;

public class Work2 {
/*
Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
тельные заменить на 0.
*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("введите три числа ");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();


        a = a > 0 ? Math.pow(a, 3) : 0; // variable = condition(умова) ? 'if true' : 'if false'

        System.out.println(a);

        b = b > 0 ? Math.pow(b, 3) : 0;
        System.out.println(b);

        c = c > 0 ? Math.pow(c, 3) : 0;
        System.out.println(c);


    }

}