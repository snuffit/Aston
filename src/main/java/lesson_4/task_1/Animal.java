package lesson_4.task_1;

public class Animal {

    private String name;
    private static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance) {
        System.out.printf("Животное %s пробежало %d метров.\n", this.name, distance);
    }

    public void swim(int distance) {
        System.out.printf("Животное %s проплыло %d метров.\n", this.name, distance);
    }

    public String getName() {
        return this.name;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
