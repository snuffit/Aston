package lesson_4.task_1;

public class FoodBowl {
    private int foodBowl = 0;

    public FoodBowl(int food) {
        this.foodBowl = food;
    }

    public void addFoodToBowl(int food) {
        foodBowl += food;
        System.out.printf("В миску было добавлено %d еды.\n", food);
    }

    public int getFoodBowl() {
        return foodBowl;
    }

    public void eat(int food) {
        foodBowl -= food;
    }
}
