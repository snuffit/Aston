package lesson_3.product;

public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("Iphone X", "01.02.2020",
                "Apple Corp.", "China", 6500, false);
        productsArray[2] = new Product("Xiaomi", "01.02.2017",
                "MiThai Corp.", "China", 399, true);
        productsArray[3] = new Product();
        productsArray[4] = new Product("Google", "01.01.2025",
                "Google Corp.", "China", 5599, true);
        for (Product prod : productsArray) {
            prod.info();
            System.out.println("----------------------------------");
        }
    }
}
