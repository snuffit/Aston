public class NumFactorial {

    public static int getNumFactorial(int num) {
        int numFactorial = 1;
        if (num < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определён.");
        }
        for (int i = 1; i <= num; i++) {
            numFactorial *= i;
        }
        return numFactorial;
    }
}
