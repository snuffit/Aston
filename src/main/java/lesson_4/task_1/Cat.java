package lesson_4.task_1;

public class Cat extends Animal {

    private final int maxRunDistance = 200;
    private static int catCount = 0;
    private boolean isFed;


    public Cat(String name) {
        super(name);
        catCount++;
        isFed = false;
    }

    @Override
    public void swim(int distance) {
        System.out.printf("Коты не умеют плавать.\n");
    }

    @Override
    public void run(int distance) {
        if (distance <= this.maxRunDistance) {
            System.out.printf("Кот %s пробежал %d метров.\n", getName(), distance);
        } else {
            System.out.printf("Коты могут пробежать максимум %d метров.\n", this.maxRunDistance);
        }
    }

    public static int getCatCount() {
        return catCount;
    }

    public void eat(FoodBowl bowl, int foodAmount) {
        if (bowl.getFoodBowl() >= foodAmount) {
            isFed = true;
            bowl.eat(foodAmount);
            System.out.printf("Кот %s наелся\n", getName());
        } else {
            System.out.printf("Кот %s не наелся. В миске было %d, а коту нужно %d.\n", getName(), bowl.getFoodBowl(), foodAmount);
        }
    }

    @Override
    public String toString() {
        if (isFed) {
            return "Кот " + getName() + " сытый\n";
        }
        return "Кот " + getName() + " не сытый\n";
    }
}
