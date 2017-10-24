package ua.artocde.week1.gy;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

       // Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
        Scanner sc = new Scanner(System.in);

        System.out.println( "введите три числа");
        int a  = sc.nextInt();
        int  b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c){
            System.out.println("найбільше число" +  a );
        } else if (b > a && b > c){
            System.out.println("найбільше число" + b);
        } else {
            System.out.println("найбільше число" + c);
        }

        if ( a < b && a < c ){
            System.out.println("найменше число" +  a );
        }
        if ( b < a && b < c){
            System.out.println("найменше число" + b);
        }
        if (c < a && c < b){
            System.out.println("найменше число" + c);
        }
    }
}
