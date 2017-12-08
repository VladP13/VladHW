package ua.artocde.week3;
//Удалить из предложения слова которые повторяются.

import java.util.Scanner;

/**
 * Created by Влад on 17.11.2017.
 */
public class Work11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("words");
        String line = sc.nextLine();
        String[] mas = line.split(" ");


        for (String word : mas) {
            if (line.indexOf(word) != line.lastIndexOf(word)) {
                line = line.replaceAll(word, "");
            }
        }
        System.out.println(line);


    }
}
