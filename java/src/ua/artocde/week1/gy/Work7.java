package ua.artocde.week1.gy;
/*вести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
        времени года. Если пользователь введет недопустимое число, программа
        должна выдать сообщение об ошибке*/

import java.util.Scanner;

public class Work7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("введіть число від 1 до 12");

        int a = sc.nextInt();
        if (a > 0 && a <= 2 || a == 12) {
            System.out.println("зима");
        } else if (a >= 3 && a <= 5) {
            System.out.println("весна");
        } else if (a >= 6 && a <= 8) {
            System.out.println("літо");
        } else if (a>= 9 && a <= 11) {
            System.out.println("осінь");
        } else {
            System.out.println("помилка");
        }
    }
}

