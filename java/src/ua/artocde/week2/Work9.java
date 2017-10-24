package ua.artocde.week2;

import ua.artocde.method.ArrayUtils;

/*public static int[] splitArray(int[] arr, int start, int end) { // обрезать массив по границам start и end
        }*/
public class Work9 {

    public static void main(String[] args) {
        int[] mas = ArrayUtils.generateMas(10, 10);
        ArrayUtils.printArr(mas);
        int[] result = splitArray(mas,5,8);
        ArrayUtils.printArr(result);
    }

    public static int[] splitArray(int[] arr, int start, int end) {
        int size = end - start;                 // 8 - 5 = 3
        int[] mas = new int[size];              // mas 3 elements

        for (int i = 0; i < mas.length; i++) {  // 0..3
            mas[i] = arr[start];                // i = 0, start = 5; i = 1, start = 6; i = 2, start = 7
            start += 1;   //бігти по старту 5,6,7 комірки    // start = 6, start = 7, start = 8;
        }

        return mas;
    }
}

