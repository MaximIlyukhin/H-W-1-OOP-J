public class Milk extends Drinks {
    protected float percentageOfFat;
    protected int expirationDate;

    public Milk(String name, double price, int quantity, String unit, double valume, float percentageOfFat,
    int expirationDate) {
        super(name, price, quantity, unit, valume);
        this.percentageOfFat = percentageOfFat;
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Название - " + name + 
        ", цена = " + price + 
        ", количество = " + quantity + 
        ", единица измерения = " + unit +
        ", объём = " + valume +
        ", процент жирности = " + percentageOfFat + 
        ", срок годности = " + expirationDate;
    }
}
