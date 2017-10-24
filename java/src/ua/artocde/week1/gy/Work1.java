package ua.artocde.week1.gy;

import java.util.Scanner;

public class Work1 {

    public static void main(String[] args) {
        //Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
        //   лить, является ли он прямоугольным. Ответ вывести в виде сообщения


        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть три сторони трикутника");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

//        int result = (int) Math.pow(2, 2);

        double resultA = Math.pow(a, 2); // Math.pow(a, 2);
        double resultB = Math.pow(b, 2);
        double resultC = Math.pow(c, 2);


        // У прямокутному трикутнику сума квадратів катетів дорівнює квадрату гіпотенузи.
        //a2 + b2 = c2; b2 + c2 = a2; a2 + c2 = b2;

        if (resultA + resultB == resultC || resultB + resultC == resultA ||
                resultA + resultC == resultB) {
            System.out.println("трикутник прямокутний");
        } else {
            System.out.println("трикутник Не прямокутний");
        }

    }
}
