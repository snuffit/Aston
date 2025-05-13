package lesson_4.task_2;

public class Main {
    public static void main(String[] args) {
        Figure triangle = new Triangle(3, 4, 5, "Белый", "Черный");
        Figure circle = new Circle(3, "Желтый", "Черный");
        Figure rectangle = new Rectangle(5, 6, "Голубой", "Красный");
        System.out.println(triangle);
        System.out.println("---------------------------");
        System.out.println(circle);
        System.out.println("---------------------------");
        System.out.println(rectangle);
    }
}
