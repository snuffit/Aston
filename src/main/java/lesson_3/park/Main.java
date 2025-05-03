package lesson_3.park;

public class Main {
    public static void main(String[] args) {
        Park disneyland = new Park("Disneyland");
        disneyland.addAttraction("Колесо обозрения", "10:00-22:00", 350.0);
        disneyland.addAttraction("Американские горки", "11:00-20:00", 500.0);
        disneyland.addAttraction("Карусель", "09:00-19:00", 200.0);
        disneyland.infoAttractions();
    }
}
