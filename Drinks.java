public class Drinks extends Products{
    protected double valume;

    public Drinks(String name, double price, int quantity, String unit, double valume) {
        super(name, price, quantity, unit);
        this.valume = valume;
    }

    @Override
    public String toString() {
        return "Название - " + name + 
        ", цена = " + price + 
        ", количество = " + quantity + 
        ", единица измерения = " + unit +
        ", объём =" + valume;
    }

    
}
