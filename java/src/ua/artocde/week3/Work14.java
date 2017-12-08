package ua.artocde.week3;
//Написать морской бой(1 корабль). Размер поля указывает пользователь. При промахе показывать подсказку.

import ua.artocde.method.MatrixUtils;

import java.util.Scanner;

import static ua.artocde.method.MatrixUtils.generateField;

/**
 * Created by Влад on 17.11.2017.
 */
public class Work14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int row = sc.nextInt();
        System.out.println("enter columns");
        int column = sc.nextInt();

        String[][] emptyField = generateField(row, column); // 5 x 5
        int max = Math.max(row, column);

        int shipSize = 0;
        while (shipSize == 0) {
            shipSize = (int) (Math.random() * max); // 2
        }

        boolean vertical = shipSize <= row;


        String[][] shipField = MatrixUtils.generateField(row, column);

        if (vertical) {
            int columnNumber = (int) (Math.random() * column);

            if (columnNumber >= column) {
                columnNumber--;
            }

            int startNumber = (int) (Math.random() * (row - shipSize));

            for (int i = startNumber; i < startNumber + shipSize; i++) {
                shipField[i][columnNumber] = "x";
            }
        } else {
            int rowNumber = (int) (Math.random() * row);

            if (rowNumber >= row) {
                rowNumber--;
            }
            int startNumber = (int) (Math.random() * (column - shipSize));

            for (int i = startNumber; i < startNumber + shipSize; i++) {
                shipField[rowNumber][i] = "x";
            }
        }

//        MatrixUtils.printMatrix(shipField);

        boolean victory = false;

        while (!victory) {

            System.out.println("Enter row");
            int userRow = sc.nextInt(); // 7
            System.out.println("Enter column");
            int userColumn = sc.nextInt();


            int realRow = userRow - 1;
            int realColumn = userColumn - 1;

            if (shipField[realRow][realColumn].equals("x")) {
                emptyField[realRow][realColumn] = "x";
                shipField[realRow][realColumn] = ".";
                System.out.println("Попав!");
            } else {
                emptyField[realRow][realColumn] = "-";
                System.out.println("Не попав");

                System.out.println(hint(shipField, realRow, realColumn));
            }

            MatrixUtils.printMatrix(emptyField);

            victory = checkVictory(shipField);
        }
        System.out.println("Переможець!");
    }

    public static String hint(String[][] field, int row, int column) {

        int userRow = 0;
        int userColumn = 0;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals("x")) {
                    userRow = i;
                    userColumn = j;
                    break;
                }
            }
        }
        if (userRow == row) {
            return (userColumn < column) ? "Стріляй лівіше" : "Стріляй правіше";
        } else if (userRow < row) {
            return "Стріляй вище";
        } else return "Стріляй нище";

    }


    public static boolean checkVictory(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals("x")) {
                    return false;
                }
            }
        }

        return true;
    }
}