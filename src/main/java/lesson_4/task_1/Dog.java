package lesson_4.task_1;

public class Dog extends Animal {

    private final int maxRunDistance = 500;
    private final int maxSwimDistance = 10;
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void swim(int distance) {
        if (distance <= this.maxSwimDistance) {
            System.out.printf("Собака %s проплыла %d метров.\n", getName(), distance);
        } else {
            System.out.printf("Собаки могут проплыть максимум %d метров.\n", this.maxRunDistance);
        }
    }

    @Override
    public void run(int distance) {
        if (distance <= this.maxRunDistance) {
            System.out.printf("Собака %s пробежала %d метров.\n", getName(), distance);
        } else {
            System.out.printf("Собаки могут пробежать максимум %d метров.\n", this.maxRunDistance);
        }
    }

    public static int getDogCount() {
        return dogCount;
    }

}
