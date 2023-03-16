public class FoodProducts extends Products {
    protected int expirationDate;

    public FoodProducts(String name, double price, int quantity, String unit, int expirationDate) {
        super(name, price, quantity, unit);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Название - " + name + 
        ", цена = " + price + 
        ", количество = " + quantity + 
        ", единица измерения = " + unit +
        "Срок годности = " + expirationDate;
    }
    
    
}
