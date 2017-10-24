package ua.artocde.week1.gy;
/*
Написать программу, которая при вводе числа в диапазоне от 1 до 99
        добавляет к нему слово "копейка" в правильной форме. Например, 1
        копейка, 5 копеек, 42 копейки
*/

import java.util.Scanner;

public class Work11 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("введіть число від 1 - 99");

        int number = sc.nextInt();

        if (number % 10 == 1 && number != 11) {
            System.out.println(number + " копейка");
        } else if (number % 10 >= 2 && number % 10 <= 4 && !(number >= 12 && number <= 14)) {
            // 2, 3, 4
            System.out.println(number + " копейки");
        } else if ((number % 10 >= 5 && number % 10 <= 9) || number % 10 == 0 || (number >= 11 && number <= 14)) {
            // 5, 6, 7, 8, 9, 0
            System.out.println(number + " копеек");
        }

//        if (number == 1 || number == 21 || number == 31 || number == 41 || number == 51 ||
//                number == 61 || number == 71 || number == 81 || number == 91) {
//            System.out.println(number + " копейка ");
//
//        } else if (number >= 2 && number <= 4 || number >= 22 && number <= 24 || number >= 32 && number <= 34
//                || number >= 42 && number <= 44 || number >= 52 && number <= 54
//                || number >= 62 && number <= 64 || number >= 72 && number <= 74
//                || number >= 92 && number <= 94 || number >= 82 && number <= 84) {
//            System.out.println(number + " копейки ");
//        } else {
//            System.out.println(number + " копеек");
//        }


    }
}
