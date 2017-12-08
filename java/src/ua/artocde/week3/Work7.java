package ua.artocde.week3;
/*Требуется найти самую длинную непрерывную цепочку нулей  и единиц в последовательности цифр.

        Вход: 10001101001


        Выход:
        [2,4] - цепочка нулей
        [5,6] - цепочка единиц
        */

/**
 * Created by Влад on 28.10.2017.
 */
public class Work7 {
    public static void main(String[] args) {

        String word = "10001101001";

        int maxZero = 0;
        int maxOne = 0;

        int zeroStart = 0;
        int zeroEnd = 0;

        int oneStart = 0;
        int oneEnd = 0;


        for (int i = 0; i < word.length(); i++) {
            char tempChar = word.charAt(i);
            int temp = 1;

            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(j) == tempChar) {
                    temp++;
                } else {
                    if (tempChar == '0') {
                        if (temp > maxZero) {
                            maxZero = temp;
                            zeroStart = i;
                            zeroEnd = j - 1;
                        }
                    } else {
                        if (temp > maxOne) {
                            maxOne = temp;
                            oneStart = i;
                            oneEnd = j - 1;
                        }
                    }
                    temp = 0;
                    i = j - 1;
                    break;
                }
            }
        }

        System.out.println();

    }
}
