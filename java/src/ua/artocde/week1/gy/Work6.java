package ua.artocde.week1.gy;

import java.util.Scanner;

// У вас есть скорость и растояние, за какое время вы приедете в пукт назначания
public class Work6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" введіть швидкість ");
        float speed = sc.nextFloat();

        System.out.println(" введіть відстань ");
        float distance = sc.nextFloat();

        float time = distance / speed;

        System.out.println(" за " + time + " години ");

    }
}
