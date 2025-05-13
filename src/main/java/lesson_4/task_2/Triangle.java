package lesson_4.task_2;

public class Triangle implements Figure {

    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final String borderColor;
    private final String fillColor;

    public Triangle(double sideA, double sideB, double sideC, String borderColor, String fillColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return "Периметр треугольника - " + calculatePerimeter() + "\n" +
                "Площадь треугольника - " + calculateArea() + "\n" +
                "Цвет фона - " + fillColor + "\n" +
                "Цвет границ - " + borderColor + "\n";
    }
}
