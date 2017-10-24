package ua.artocde.week1.gy;
/*Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число*/
import java.util.Scanner;

public class Work16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("введіть число ");

        int number = sc.nextInt();
        String ostacha = "";

        while (true) {
            if (number == 0) {
                break;
            } else if (number % 2 == 0) {
                ostacha += 0;
            } else if (number % 2 == 1) {
                ostacha += 1;
            }
            number /= 2;

        }
        System.out.println(ostacha);



    }


    }



