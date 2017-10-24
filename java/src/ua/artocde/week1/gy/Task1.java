package ua.artocde.week1.gy;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите время(0-24)");
        int time = sc.nextInt();
        if (time > 9 && time < 18) {
            System.out.println("Я на работе");
        } else {
            System.out.println("Я дома");
        }
    }
}
