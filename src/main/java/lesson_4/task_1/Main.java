package lesson_4.task_1;

public class Main {
    public static void main(String[] args) {
        FoodBowl bowl = new FoodBowl(45);
        bowl.addFoodToBowl(3);
        Cat[] cats = new Cat[]{
                new Cat("Саманта"),new Cat("Оливер"), new Cat("Джексон"),
                new Cat("Вайсон"), new Cat("Беляш")};
        for (Cat cat : cats){
            cat.eat(bowl, 10);
        }
        System.out.println("------------------------------");
        for(Cat cat : cats){
            System.out.print(cat);
        }
    }
}
