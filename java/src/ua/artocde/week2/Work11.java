package ua.artocde.week2;

import java.util.Scanner;

//Проверить или является число простым
public class Work11 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        if(numb % 2 != 0){

            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}