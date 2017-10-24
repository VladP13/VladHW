package ua.artocde.week2;

import ua.artocde.method.ArrayUtils;

/*
Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
*/
public class work6 {
    public static void main(String[] args) {

        int[] mas = ArrayUtils.generateMas(10, 10);

        int sumLeft = 0;
        int sumRight = 0;
        int halfLength = mas.length / 2;

        for (int i = 0; i < halfLength; i++) {
            sumLeft += mas[i];
        }

        for (int i = halfLength; i < mas.length; i++) {
            sumRight += mas[i];
        }

        int leftAverage = sumLeft / halfLength;
        int rightAverage = sumRight / halfLength;

        if(leftAverage > rightAverage){
            System.out.println("leftAverage " + leftAverage);
        }else {
            System.out.println("rightAverage " + rightAverage );
        }ArrayUtils.printArr(mas);

       /* int []mas = {85,70,56,69,68,54};

        int half = (mas[0] + mas[1] + mas[2]) /3;
        int half2 = (mas[3] + mas[4] + mas[5]) /3;

        if (half > half2){
            System.out.println(half + " half");
        }else{
            System.out.println(half2 + " half2");
        }
*/
    }
}
