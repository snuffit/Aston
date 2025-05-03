package lesson_3.park;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private String parkName;
    private List<Attraction> attrations;

    public Park(String parkName) {
        this.parkName = parkName;
        this.attrations = new ArrayList<>();
    }

    public class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }


        @Override
        public String toString() {
            return "Аттракцион: " + name +
                    " | Время работы: " + workingHours +
                    " | Стоимость: " + price;
        }
    }

    public void addAttraction(String name, String workingHours, double price) {
        attrations.add(new Attraction(name, workingHours, price));
    }


    public void infoAttractions() {
        System.out.println("Аттракционы парка " + parkName + ":");
        for (Attraction attr : attrations) {
            System.out.println(attr);
        }
    }
}
