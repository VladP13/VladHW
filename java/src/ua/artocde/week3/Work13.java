package ua.artocde.week3;
 /*Строки. Ввод пароля.
         Написать программу ввода пароля пользователя. Пользователь вводит пароль 2 раза. Пароль должен удовлетворять следующим требованиям:
         - длинна пароля должна быть от 8 до 20 символов
         - в пароле должны быть как маленькие так и большие буквы
         - должны быть цифры
         - не должен содержать слов 'password', 'pass', 'gfhjkm'
         - генерировать случайный пароль используя символы: a-z A-Z 0-9*/

import java.util.Scanner;

/**
 * Created by Влад on 17.11.2017.
 */
public class Work13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password1 = sc.nextLine();

        boolean badPass = checkPass(password1);

        if (badPass) {
            System.out.println("bad pass");
            System.out.println("input pass Size");

            int passSize = sc.nextInt();

            String password = "";

            String allSymbols = "qazwsxedcrfvtgbyhnujmiklopQAZWSXEDCRFVTGBYHNUJMIKLOP1234567890";
            char[] chars = allSymbols.toCharArray();

            password = getPassword(passSize, password, chars);

            while (!password.matches("^\\D+$") && password.equals(password.toUpperCase())//Если стрічки однакові, значить всі символи були маленькі,// інакше хоть одна була велика:)
                    && password.equals(password.toUpperCase())) {
                password = getPassword(passSize, password, chars);
            }
            System.out.println(password);
        } else {
            System.out.println("Крутий пароль!");
        }
    }


    public static String getPassword(int passSize, String password, char[] chars) {
        if (passSize < 8) {
            return "short pass";

        } else {
            for (int i = 0; i < passSize; i++) {
                int randomIndex = (int) (Math.random() * (chars.length - 1));
                password += chars[randomIndex];

            }
            return password;
        }
    }

    public static boolean checkPass(String password1) {
        return (password1.length() < 8 || password1.length() > 20) ||
                password1.toUpperCase().equals(password1) ||
                password1.toLowerCase().equals(password1) ||
                password1.contains("password") ||
                password1.contains("pass") ||
                password1.contains("gfhjkm");

    }

}

