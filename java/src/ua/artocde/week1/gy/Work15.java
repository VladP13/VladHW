package ua.artocde.week1.gy;
/*
Известны площади круга и квадрата. Определить: а) уместится ли круг в
        квадрат; б) уместится ли квадрат в круге.
*/

import java.util.Scanner;

public class Work15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" введіть площу круга ");
        int ploschaKruga = sc.nextInt();
        System.out.println(" введіть площу квадрата ");
        int ploschaKvadrata = sc.nextInt();

        int StoronaKvadrata = ploschaKvadrata / 4;
        double diagonal = StoronaKvadrata * Math.sqrt(2);
        double radiusKruga = Math.sqrt(ploschaKruga / Math.PI); // s = PR^2. R^2 = s / p
        double diametr = radiusKruga * 2;
       /* Если вам известна площадь круга, то для нахождения диаметра разделите ее на π и извлеките из результата квадратный
        корень, чтобы получить радиус; затем умножьте на 2 для получения диаметра.*/
        if (diagonal < ploschaKruga) {
            System.out.println(" квадрат поміститься в круг");
        } else {
            System.out.println(" квадрат НЕ поміститься в круг");
        }

        if (diametr <= StoronaKvadrata) {
            System.out.println(" круг поміститься в квадрат ");
        } else {
            System.out.println(" круг НЕ поміститься квадрат");
        }


    }
}
