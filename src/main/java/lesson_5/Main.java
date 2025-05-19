package lesson_5;

public class Main {

    public static void main(String[] args) {
        String[][] correctArray = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"3", "3", "7", "8"},
                {"11", "15", "23", "72"}
        };
        String[][] incorrectSizeArray = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"3", "3", "7", "8"},
                {"11"}
        };
        String[][] incorrectDataArray = new String[][]{
                {"1", "str", "3", "4"},
                {"5", "6", "7", "8"},
                {"3", "3", "o", "8"},
                {"11", "num", "23", "72"}
        };
        testSumArray(correctArray);
        testSumArray(incorrectDataArray);
        testSumArray(incorrectSizeArray);
        catchArrayIndexOutOfBoundsException();
    }

    public static int sumArray(String[][] array) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != 4 || array[i].length != 4) {
                throw new MyArraySizeException("Ошибка: длинна массива не равна 4 на 4");
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Невозможно преобразовать в число: '" + array[i][j] + "'", i, j);
                }
            }
        }
        return sum;
    }

    public static void testSumArray(String[][] array) {
        try {
            System.out.println(sumArray(array));
        } catch (MyArraySizeException e) {
            System.out.println(e);
        } catch (MyArrayDataException e) {
            System.out.println(e);
        }
    }

    public static void catchArrayIndexOutOfBoundsException() {
        int[] array = new int[4];
        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка " + e.getMessage());
        }
    }
}
