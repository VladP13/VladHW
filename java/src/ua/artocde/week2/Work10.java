package ua.artocde.week2;
// Инвертировать массив (без использования допольнительного массива)

import ua.artocde.method.ArrayUtils;

public class Work10 {
    public static void main(String[] args) {

        int[] mas = ArrayUtils.generateMas(5, 10);

        ArrayUtils.printArr(mas);

        int one = mas[0];
        int two  = mas[1];

         for (int i = 0; i < mas.length / 2; i++) {
              int temp = mas[i];
              mas[i] = mas[mas.length - 1 - i];
              mas[mas.length - 1 - i] = temp;
         }

         mas[3] = two;
         mas[4] = one;

         ArrayUtils.printArr(mas);
    }
}
