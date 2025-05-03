package lesson_3.product;

public class Product {
    private String title;
    private String date;
    private String manufacturer;
    private String country;
    private int price;
    private boolean bookingStatus;

    public Product(String title, String date, String manufacturer, String country, int cost, boolean bookingStatus) {
        this.title = title;
        this.date = date;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.bookingStatus = bookingStatus;
    }

    public Product() {
        this.title = "NULL";
        this.date = "00.00.0000";
        this.manufacturer = "NULL";
        this.country = "NULL";
        this.price = 0;
        this.bookingStatus = false;
    }

    public void info() {
        System.out.println("Название: " + this.title +
                "\nДата производства: " + this.date +
                "\nПроизводитель: " + this.manufacturer +
                "\nСтрана происхождения: " + this.country +
                "\nЦена: " + this.price +
                "\nСостояние бронирования покупателем: " + this.bookingStatus);
    }
}
