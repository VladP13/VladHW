package ua.artocde.week2;
//Посчитать колличество букв 'a' в строке (искомый символ может быть разным)
import java.util.Scanner;

public class Work12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the word ");
        String word = sc.next();
        System.out.println(" enter the character you want to count ");
        String el = sc.next();

        int count = 0;
        for (int i = 0; i < word.length() ; i++) {
             count += (word.substring(i,i+1).equals(el))  ? 1 : 0;
        }
        System.out.println( count );
    }
}
