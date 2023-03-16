
public class Bread extends FoodProducts {
    protected String typeOfFlour;

    public Bread(String name, double price, int quantity, String unit, int expirationDate, String typeOfFlour) {
        super(name, price, quantity, unit, expirationDate);
        this.typeOfFlour = typeOfFlour;
    }

    @Override
    public String toString() {
        return "Название - " + name + 
        ", цена = " + price + 
        ", количество = " + quantity + 
        ", единица измерения = " + unit +
        ",Тип муки = " + typeOfFlour;
    }


    
}
