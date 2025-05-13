package lesson_4.task_2;

public class Circle implements Figure {

    private final double radius;
    private final String borderColor;
    private final String fillColor;

    public Circle(double radius, String borderColor, String fillColor) {
        this.radius = radius;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    @Override
    public double calculateArea() {
        double area = 3.14 * radius * radius;
        return Math.round(area * 100.0) / 100.0;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * 3.14 * radius;
        return Math.round(perimeter * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Периметр круга - " + calculatePerimeter() + "\n" +
                "Площадь круга - " + calculateArea() + "\n" +
                "Цвет фона - " + fillColor + "\n" +
                "Цвет границ - " + borderColor + "\n";
    }
}
