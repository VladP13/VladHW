package ua.artocde.week1.gy;
/*осчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
        5678  -   1
        5889  -   2
        8888  -   4
        989990  - 1
*/

        import java.util.Scanner;

public class Work18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" ввести число ");

        int  number = sc.nextInt();

        int numb = 0;

        for (int i = 0; i < number; i++) {
          numb += i == 8? 1 : 0;
        }
        System.out.println("The number 8 repeats " + numb);



    }
        }



