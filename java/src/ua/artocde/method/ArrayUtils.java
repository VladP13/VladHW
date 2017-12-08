package ua.artocde.method;

import ua.artocde.week2.Work9;

public class ArrayUtils {


    public static void printArr(int[] arr) {
        // mas = {1, 4, 6, 2, 9}
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] generateMas(int size, int range) {
        // size = 5
        //              0  1  2  3  4
        // int[] mas = {0, 0, 0, 0, 0}
        int[] mas = new int[size];
        // пробігаєшся по масиву, і записуєш в кожен елемент своє значення
        for (int i = 0; i < mas.length; i++) {
            // i = 0
            // mas[0] = 0
            mas[i] = getRandomNum(range);
        }

        return mas;//метод закритий.вихід
    }

    public static int getRandomNum(int range) {
        return (int) (Math.random() * range);
    }


    public static int[] genRandomMasEvenNam(int size, int range) {

        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {

            int random = getRandomNum(range);

            mas[i] = random % 2 == 0 ? random : random + 1;
        }

        return mas;
    }

    public static String convert(int[] mas) {

        String res = "";
        for (int i = 0; i < mas.length; i++) {
            res = res + mas[i] + ",";
        }

        return res;
    }

    public static int[] genRandomOddNam(int size, int range) {

        int mas[] = new int[size];
        for (int i = 0; i < mas.length; i++) {

            int random = getRandomNum(range);
            mas[i] = random % 2 != 0 ? random : random + 1;
        }
        return mas;
    }

    public static int generateRandomNumberBetween(int ot, int doo) {
        int range = doo - ot;
        int random = (int) (Math.random() * range);
        int result = ot + random;
        return result;
    }

    public static int[] moveArray(int[] mas, int move) {
        int n = move;
        int[] b = new int[mas.length];
        for (int i = mas.length - 1; i >= 0; i--) {
            if (i + n >= mas.length) {
                b[i + n - mas.length] = mas[i];
            } else {
                b[i + n] = mas[i];
            }

        }
        return b;
    }

    public static int[] moveArrayLeft(int[] mas, int move) {
        if (mas != null) {
            for (int m = 0; m < move; m++) {
                int tmp = mas[0]; //сохраняєм елемент нульової комірки
                for (int i = 0; i < mas.length - 1; i++) {
                    mas[i] = mas[i + 1];//переміщаєм весь мачив в ліво на 1 елемент
                }
                mas[mas.length - 1] = tmp;//переносим збережений елемент в кінець масива
            }
            return mas;
        } else {
            return null;
        }
    }

    public static int[] moveArrayRight(int[]mas,int move){
        if(mas != null){
            for (int i = 0; i < move ; i++) {
                int tmp = mas[mas.length - 1];//сохряняєм останній елемент
                for (int j = mas.length -1; j > 0; j--) {
                    mas[j] = mas[j - 1];
                }
                mas [0] = tmp;

            }
            return mas;
        } else {
            return null;
        }
    }
}




