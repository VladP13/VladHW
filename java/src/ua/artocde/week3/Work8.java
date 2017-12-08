package ua.artocde.week3;
//Найти самое длинное слово в строке(разделенное одним пробелом)

import java.util.Scanner;

/**
 * Created by Влад on 31.10.2017.
 */
public class Work8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" write words ");
        String line = sc.nextLine();

        String[] words = line.split(" ");
        int max = 0;
        String maxWord = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max) {
                max = words[i].length();
                maxWord = words[i];
            }
        }
        System.out.println(maxWord);


    }
}
