package lesson_4.task_2;

public class Rectangle implements Figure {

    private final double sideA;
    private final double sideB;
    private final String borderColor;
    private final String fillColor;

    public Rectangle(double sideA, double sideB, String borderColor, String fillColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public double calculatePerimeter() {
        return (sideA + sideB) * 2;
    }

    @Override
    public String toString() {
        return "Периметр прямоугольника - " + calculatePerimeter() + "\n" +
                "Площадь прямоугольника - " + calculateArea() + "\n" +
                "Цвет фона - " + fillColor + "\n" +
                "Цвет границ - " + borderColor + "\n";
    }
}
