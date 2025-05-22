package lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class lesson2 {

    public static void main(String[] args) {
        //Задание 1
        printThreeWords();
        row();
        //Задание 2
        checkSumSign();
        row();
        //Задание 3
        printColor();
        row();
        //Задание 4
        compareNumbers();
        row();
        //Задание 5
        if(isSumBetween10And20(scanner().nextInt(), scanner().nextInt())){
            System.out.println("Это число находится между 10 и 20");
        }else {
            System.out.println("Это число не находится между 10 и 20");
        }
        row();
        //Задание 6
        isNumPositive();
        row();
        //Задание 7
        if(isNumNegative()){
            System.out.println("Это отрицательное число");
        }else {
            System.out.println("Это положительное число");
        }
        row();
        //Задание 8
        multiplyStr("String", 3);
        row();
        //Задание 9
        if(isLeapYear()){
            System.out.println("Это високосный год");
        }else {
            System.out.println("Это не високосный год");
        }
        row();
        //Задание 10
        fromZeroToOne();
        row();
        //Задание 11
        arrayFrom0To100();
        row();
        //Задание 12
        arrayEdit();
        row();
        //Задание 13
        changeDiagonal();
        row();
        //Задание 14
        makeArray(10, 4);

    }

    public static void printThreeWords() {
        System.out.print("Orange\n" +
                "Banana\n" +
                "Apple\n");
    }

    public static void checkSumSign() {
        System.out.print("Введите первое число: ");
        int a = scanner().nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner().nextInt();
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        System.out.print("Введите значение цвета: ");
        int value = scanner().nextInt();
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Красный");
        }
    }

    public static void compareNumbers() {
        System.out.print("Введите число a: ");
        int a = scanner().nextInt();
        System.out.print("Введите число b: ");
        int b = scanner().nextInt();
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumBetween10And20(int firstNum, int secondNum) {
        int sum = firstNum + secondNum;
        return  (sum >= 10 && sum <= 20);
    }

    public static void isNumPositive() {
        System.out.print("Введите число: ");
        int num = scanner().nextInt();
        if (num >= 0) {
            System.out.println("Это число положительное");
        } else {
            System.out.println("Это число отрицательное");
        }
    }

    public static boolean isNumNegative() {
        System.out.print("Введите число: ");
        int num = scanner().nextInt();
        return num >= 0;

    }

    public static void multiplyStr(String string, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(string);
        }
    }

    public static boolean isLeapYear() {
        System.out.print("Введите год: ");
        int year = scanner().nextInt();
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void fromZeroToOne() {
        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Было - " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println("Стало - " + Arrays.toString(array));
    }

    public static void arrayFrom0To100() {
        int[] array = new int[100];
        for (int i = 1; i <= 100; i++) {
            array[i - 1] = i;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void arrayEdit() {
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Было - " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println("Стало - " + Arrays.toString(array));
    }

    public static void changeDiagonal() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Было - ");
        printMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
        }
        System.out.println("Первая диагональ - ");
        printMatrix(matrix);
        for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {
            matrix[i][j] = 1;
        }
        System.out.println("Вторая диагональ - ");
        printMatrix(matrix);
    }

    public static void makeArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static void row() {
        System.out.println("-----------------------------------");
    }
}
