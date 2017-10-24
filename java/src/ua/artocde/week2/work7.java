package ua.artocde.week2;

import ua.artocde.method.ArrayUtils;

/*
 Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
         который получается в результате суммы arr1[i] + arr2[i]
*/
public class work7 {
    public static void main(String[] args) {


        int[] arr1 = ArrayUtils.generateMas(5, 50);
        int[] arr2 = ArrayUtils.generateMas(5, 50);

        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        ArrayUtils.printArr(arr1);
        System.out.println(sum + " сумма першого масива ");


        int sum2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }
        ArrayUtils.printArr(arr2);
        System.out.println(sum2 + " сумма другого масива");
        System.out.println(sum + sum2 + " сумма двох масивів");

        /////////
        int mySum = 0;
        for (int i = 0; i < arr1.length; i++) {
            mySum += arr1[i];
            mySum += arr2[i];
        }
        System.out.println(mySum);
    }
}
