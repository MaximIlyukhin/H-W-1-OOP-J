public class Products {
    protected String name;
    protected double price;
    protected int quantity;
    protected String unit;
    
    public Products(String name, double price, int quantity, String unit) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Название - " + name + 
        ", цена = " + price + 
        ", количество = " + quantity + 
        ", единица измерения = " + unit;
    }
    


}
