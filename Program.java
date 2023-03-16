public class Program {
    public static void main(String[] args) {
        Products[] products = new Products[] {
                new Bread("Бородинский хлеб", 100, 10, "штук", 2020, "Кукурузная"),
                new Diapers("Подгузники", 1000, 20, "штук", 3, false, 10, 10, 30, "Простые"),
                new Eggs("Яйца", 150, 10, "штук", 2023, 10),
                new Lemonade("Дюшес", 55, 1, "литр", 1),
                new Masks("Маски", 10, 100, "штук", 100),
                new Milk("Молоко", 90, 6, "литр", 2, 3, 2020),
                new Nipples("Соски", 30, 10, "штук", 0, false) };
        showFeatures(products);
    }

    public static void showFeatures(Products[] products) {
        for (Products product : products) {
            System.out.println(product);
        }
    }
}