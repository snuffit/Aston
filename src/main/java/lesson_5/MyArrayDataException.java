package lesson_5;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(String message, int row, int col) {
        super(String.format("%s [строка %d, столбец %d]", message, row, col));
    }
}
