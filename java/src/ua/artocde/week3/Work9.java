package ua.artocde.week3;
/*Напишите программу, которая позволяет пользователю ввести в консоли строку,
        переводит первый символ слов в верхний регистр и результат выводит в консоль

        Вход:
        иван васильевич

        Выход:
        Иван Васильевич*/

import java.util.Scanner;

/**
 * Created by Влад on 31.10.2017.
 */
public class Work9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String a = sc.nextLine();
        String[] words = a.split(" ");

        String output = "";
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
            output += words[i] + " ";

        }
        System.out.println(output);
    }
}
